package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C4JM;
import X.DD4;
import X.DDA;
import X.DDB;
import X.DDD;
import X.InterfaceC3408CKu;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraPlayAppUpdateManager$instance$2 extends AbstractC7559F3s implements Function0<InterfaceC3408CKu> {
    public static final AuraPlayAppUpdateManager$instance$2 INSTANCE = new AuraPlayAppUpdateManager$instance$2();

    public AuraPlayAppUpdateManager$instance$2() {
        super(0);
    }

    public static InterfaceC3408CKu A00(Context context) {
        DDD dd4;
        synchronized (DDB.class) {
            dd4 = DDB.A00;
            if (dd4 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                dd4 = new DD4(new DDA(context));
                DDB.A00 = dd4;
            }
        }
        return (InterfaceC3408CKu) ((DD4) dd4).A00.AjF();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC3408CKu invoke() {
        return A00(C4JM.A00());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InterfaceC3408CKu invoke() {
        return A00(C4JM.A00());
    }
}
