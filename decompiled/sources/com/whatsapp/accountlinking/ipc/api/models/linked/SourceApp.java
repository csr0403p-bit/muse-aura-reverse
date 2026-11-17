package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SourceApp {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ SourceApp[] A01;

    static {
        SourceApp[] sourceAppArr = {new SourceApp("FACEBOOK", 0), new SourceApp("INSTAGRAM", 1)};
        A01 = sourceAppArr;
        A00 = C3cG.A0w(sourceAppArr);
    }

    public static SourceApp valueOf(String str) {
        return (SourceApp) Enum.valueOf(SourceApp.class, str);
    }

    public static SourceApp[] values() {
        return (SourceApp[]) A01.clone();
    }

    public SourceApp(String str, int i) {
    }
}
