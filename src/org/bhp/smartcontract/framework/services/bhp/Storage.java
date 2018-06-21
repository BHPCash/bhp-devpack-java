package org.bhp.smartcontract.framework.services.bhp;

import java.math.BigInteger;

import org.bhp.smartcontract.framework.Syscall;

public final class Storage {
	@Syscall("Bhp.Storage.GetContext")
	public native static StorageContext currentContext();

	@Syscall("Bhp.Storage.Get")
	public native static byte[] get(StorageContext context, byte[] key);

	@Syscall("Bhp.Storage.Get")
	public native static byte[] get(StorageContext context, String key);

	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, byte[] key, byte[] value);
	
	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, byte[] key, BigInteger value);

	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, byte[] key, String value);

	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, String key, byte[] value);
	
	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, String key, BigInteger value);

	@Syscall("Bhp.Storage.Put")
	public native static void put(StorageContext context, String key, String value);

	@Syscall("Bhp.Storage.Delete")
	public native static void delete(StorageContext context, byte[] key);

	@Syscall("Bhp.Storage.Delete")
	public native static void delete(StorageContext context, String key);
}
