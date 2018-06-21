package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public class Contract {
	@Syscall("Bhp.Contract.GetScript")
	public native byte[] script();

	@Syscall("Bhp.Contract.GetStorageContext")
	public native StorageContext storageContext();

	@Syscall("Bhp.Contract.Create")
	public native static Contract create(byte[] script, byte[] parameter_list, byte return_type, boolean need_storage,
			String name, String version, String author, String email, String description);

	@Syscall("Bhp.Contract.Migrate")
	public native static Contract migrate(byte[] script, byte[] parameter_list, byte return_type, boolean need_storage,
			String name, String version, String author, String email, String description);

	@Syscall("Bhp.Contract.Destroy")
	public native static void destroy();
}
