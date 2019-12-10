package codebase.graphTheory.algorithms.steinerProblems.steinerArborescenceApproximation;

import codebase.graphTheory.algorithms.Algorithm;
import codebase.graphTheory.graph.Arc;
import codebase.graphTheory.instances.Instance;
import codebase.graphTheory.instances.steiner.classic.SteinerDirectedInstance;

import java.util.HashSet;

/**
 * This class merges some elements of all SteinerArborescence Approximation Algorithms:
 * an Steiner DIrected Instance as input and an arborescence and its cost as output.
 * 
 * @author Watel Dimitri
 *
 */
public abstract class SteinerArborescenceApproximationAlgorithm extends
		Algorithm<SteinerDirectedInstance> {

	protected HashSet<Arc> arborescence;
	protected Integer cost;

	public HashSet<Arc> getArborescence() {
		return arborescence;
	}

	public Integer getCost() {
		return cost;
	}

	@Override
	protected void setNoSolution() {
		arborescence = null;
		cost = -1;
	}


}
