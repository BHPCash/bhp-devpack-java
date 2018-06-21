package org.bhp.smartcontract.framework;

import java.lang.annotation.*;

import org.bhp.vm._OpCode;

@Target(ElementType.METHOD)
public @interface OpCode {
	_OpCode value();
}
