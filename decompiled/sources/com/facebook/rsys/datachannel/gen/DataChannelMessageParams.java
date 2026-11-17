package com.facebook.rsys.datachannel.gen;

import X.C8926Fti;
import X.G50;
import X.GYm;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DataChannelMessageParams {
    public static G50<DataChannelMessageParams> CONVERTER = C8926Fti.A00(49);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native DataChannelMessageParams createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(ArrayList<String> arrayList, int i, ArrayList<Long> arrayList2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native ArrayList<Long> getRecipientNodeIds();

    public native ArrayList<String> getRecipients();

    public native int getServiceRecipients();

    public native int hashCode();

    public native String toString();

    static {
        GYm.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DataChannelMessageParams)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public DataChannelMessageParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public DataChannelMessageParams(ArrayList<String> arrayList, int i, ArrayList<Long> arrayList2) {
        this.mNativeHolder = initNativeHolder(arrayList, i, arrayList2);
    }
}
