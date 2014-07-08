package com.trivago.jcha.comparator;

import com.trivago.jcha.ClassHistogramStatsEntry;


/**
 * Sort by byte count descending.
 * 
 * @author cesken
 *
 */
public class AbsoluteInstancesComparator extends BaseComparator
{

	@Override
	public int compare(ClassHistogramStatsEntry o1, ClassHistogramStatsEntry o2)
	{
		int diff = o2.getInstanceDiff() - o1.getInstanceDiff();
		return compareBase(o1, o2, diff);
	}

}