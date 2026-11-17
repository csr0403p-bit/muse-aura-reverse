package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.C6PJ;
import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AppLockDataStore$Companion$getInstance$1$dataStore$1$1$1 extends AbstractC7559F3s implements Function0<File> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockDataStore$Companion$getInstance$1$dataStore$1$1$1(Context context, String str) {
        super(0);
        this.$context = context;
        this.$name = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return C6PJ.A00(this.$context, this.$name);
    }
}
