package com.krishagni.openspecimen;

import org.springframework.beans.factory.annotation.Configurable;

import com.krishagni.catissueplus.core.biospecimen.domain.Specimen;

@Configurable
public class RegistrationEnglishLetterSequence extends AbstractEnglishLetterSequenceToken<Specimen> {

	public RegistrationEnglishLetterSequence() {
		this.name = "REG_ENG_SEQ";
	}

	@Override
	protected Integer getSequence(Specimen spmn) {
		return getUniqueId(spmn.getRegistration().getId().toString());
	}
}
