package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.appappearance.HatchRichFormatFullScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RichFormatScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$RichFormatEntryProviderKt$lambda$-264404609$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$RichFormatEntryProviderKt$lambda$264404609$1 extends AbstractC7559F3s implements G0W<RichFormatScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RichFormatEntryProviderKt$lambda$264404609$1 INSTANCE = new ComposableSingletons$RichFormatEntryProviderKt$lambda$264404609$1();

    public ComposableSingletons$RichFormatEntryProviderKt$lambda$264404609$1() {
        super(3);
    }

    public final void invoke(RichFormatScreenKey richFormatScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(richFormatScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = richFormatScreenKey.cacheId;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$RichFormatEntryProviderKt$lambda$264404609$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchRichFormatFullScreenKt.HatchRichFormatFullScreen(str, (Function0) objAaT, bfm, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RichFormatScreenKey richFormatScreenKey, BFM bfm, Integer num) {
        invoke(richFormatScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
