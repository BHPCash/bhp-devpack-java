package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.*;

public class Header implements ScriptContainer {
	@Syscall("Bhp.Header.GetHash")
	public native byte[] hash();

	@Syscall("Bhp.Header.GetVersion")
	public native int version();

	@Syscall("Bhp.Header.GetPrevHash")
	public native byte[] prevHash();

	@Syscall("Bhp.Header.GetMerkleRoot")
	public native byte[] merkleRoot();

	@Syscall("Bhp.Header.GetTimestamp")
	public native int timestamp();

	@Syscall("Bhp.Header.GetConsensusData")
	public native long consensusData();

	@Syscall("Bhp.Header.GetNextConsensus")
	public native byte[] nextConsensus();
}
