package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UploadDelivery {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UploadDelivery[] $VALUES;
    public static final Companion Companion;
    public static final UploadDelivery NATIVE_CHOOSER;
    public static final UploadDelivery SCRIPT;
    public static final UploadDelivery SET_FILE_INPUT_FILES;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        UploadDelivery uploadDelivery = new UploadDelivery("SET_FILE_INPUT_FILES", 0);
        SET_FILE_INPUT_FILES = uploadDelivery;
        UploadDelivery uploadDelivery2 = new UploadDelivery("SCRIPT", 1);
        SCRIPT = uploadDelivery2;
        UploadDelivery uploadDelivery3 = new UploadDelivery("NATIVE_CHOOSER", 2);
        NATIVE_CHOOSER = uploadDelivery3;
        UploadDelivery[] uploadDeliveryArr = {uploadDelivery, uploadDelivery2, uploadDelivery3};
        $VALUES = uploadDeliveryArr;
        $ENTRIES = C3cG.A0w(uploadDeliveryArr);
        Companion = new Companion();
    }

    public static Ey9<UploadDelivery> getEntries() {
        return $ENTRIES;
    }

    public static UploadDelivery valueOf(String str) {
        return (UploadDelivery) Enum.valueOf(UploadDelivery.class, str);
    }

    public static UploadDelivery[] values() {
        return (UploadDelivery[]) $VALUES.clone();
    }

    public UploadDelivery(String str, int i) {
    }
}
