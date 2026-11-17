package com.hatch.browser.protocol;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({"len", "data"})
/* loaded from: classes6.dex */
public class ForeignBytes extends Structure {
    public static final int $stable = 8;
    public Pointer data;
    public int len;

    public final class ByValue extends ForeignBytes implements Structure.ByValue {
        public static final int $stable = 8;
    }
}
