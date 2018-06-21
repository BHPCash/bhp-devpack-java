package org.bhp.smartcontract.framework;

import java.lang.annotation.*;

import org.bhp.smartcontract.framework.services.bhp.*;

@Target(ElementType.METHOD)
public @interface EntryPoint {
	TriggerType value();
}
