package com.krishagni.openspecimen;


import org.springframework.beans.factory.annotation.Configurable;

import com.krishagni.catissueplus.core.biospecimen.domain.Specimen;

@Configurable
public class ParentSpecimenEnglishLetterSequence extends AbstractEnglishLetterSequenceToken<Specimen> {
	public ParentSpecimenEnglishLetterSequence() {
		this.name = "PSPEC_ENG_SEQ";
	}

	@Override
	protected Integer getSequence(Specimen spmn) {
		return getUniqueId(spmn.getParentSpecimen() != null ? spmn.getParentSpecimen().getId().toString() : null);
	}
}
