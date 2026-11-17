package com.facebook.minscript.compiler.interfaces;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class MinsCompilerResult {
    public ByteBuffer A00;
    public HashMap<Integer, Integer> A01;

    public MinsCompilerResult(ByteBuffer byteBuffer, HashMap<Integer, Integer> map) {
        this.A00 = byteBuffer;
        this.A01 = map;
    }
}
