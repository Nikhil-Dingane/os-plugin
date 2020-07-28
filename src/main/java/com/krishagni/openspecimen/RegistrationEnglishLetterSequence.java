package com.krishagni.openspecimen;

import com.krishagni.catissueplus.core.biospecimen.domain.Specimen;
import com.krishagni.catissueplus.core.common.domain.AbstractGreekLetterSequenceToken;

public class RegistrationEnglishLetterSequence extends AbstractEnglishLetterSequenceToken<Specimen>{
	
	public RegistrationEnglishLetterSequence() {
		this.name = "REG_ENG_SEQ";
	}
	@Override
	protected Integer getSequence(Specimen spmn) {
		return getUniqueId(spmn.getRegistration().getId().toString());
	}

}
