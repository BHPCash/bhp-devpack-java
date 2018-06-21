package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public final class Runtime {
	@Syscall("Bhp.Runtime.GetTrigger")
	public native static TriggerType trigger();

	@Syscall("Bhp.Runtime.CheckWitness")
	public native static boolean checkWitness(byte[] hashOrPubkey);

	@Syscall("Bhp.Runtime.Notify")
	public native static void notify(Object... state);

	@Syscall("Bhp.Runtime.Log")
	public native static void log(String message);

	@Syscall("Bhp.Runtime.GetTime")
	public native static long time();
}
