/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.ucsd.sccn.lsl;

public class vectorstr {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected vectorstr(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(vectorstr obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				lslAndroidJNI.delete_vectorstr(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public vectorstr() {
		this(lslAndroidJNI.new_vectorstr__SWIG_0(), true);
	}

	public vectorstr(long n) {
		this(lslAndroidJNI.new_vectorstr__SWIG_1(n), true);
	}

	public long size() {
		return lslAndroidJNI.vectorstr_size(swigCPtr, this);
	}

	public long capacity() {
		return lslAndroidJNI.vectorstr_capacity(swigCPtr, this);
	}

	public void reserve(long n) {
		lslAndroidJNI.vectorstr_reserve(swigCPtr, this, n);
	}

	public boolean isEmpty() {
		return lslAndroidJNI.vectorstr_isEmpty(swigCPtr, this);
	}

	public void clear() {
		lslAndroidJNI.vectorstr_clear(swigCPtr, this);
	}

	public void add(String x) {
		lslAndroidJNI.vectorstr_add(swigCPtr, this, x);
	}

	public String get(int i) {
		return lslAndroidJNI.vectorstr_get(swigCPtr, this, i);
	}

	public void set(int i, String val) {
		lslAndroidJNI.vectorstr_set(swigCPtr, this, i, val);
	}

}