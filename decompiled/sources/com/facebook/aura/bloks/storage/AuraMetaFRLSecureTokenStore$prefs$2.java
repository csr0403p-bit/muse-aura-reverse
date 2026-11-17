package com.facebook.aura.bloks.storage;

import X.AbstractC7559F3s;
import X.C4oT;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMetaFRLSecureTokenStore$prefs$2 extends AbstractC7559F3s implements Function0<C4oT> {
    public static final AuraMetaFRLSecureTokenStore$prefs$2 INSTANCE = new AuraMetaFRLSecureTokenStore$prefs$2();

    public AuraMetaFRLSecureTokenStore$prefs$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4oT invoke() {
        return HatchPrefsStore.INSTANCE.metaTokenPrefs();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C4oT invoke() {
        return HatchPrefsStore.INSTANCE.metaTokenPrefs();
    }
}
