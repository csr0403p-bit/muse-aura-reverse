package com.facebook.aura.library.view;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C10G;
import X.C3U4;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$libraryErrorStateItem$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ int $messageRes;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$libraryErrorStateItem$1(int i, Function0<Unit> function0, String str, float f) {
        super(3);
        this.$messageRes = i;
        this.$onRetry = function0;
        this.$testTag = str;
        this.$gutterWidth = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, this.$messageRes), this.$onRetry, C3U4.A07(AbstractC07539Wl.A00(C10G.A02, this.$testTag), this.$gutterWidth), HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, null, bfm, 199680, 80);
        } else {
            bfm.Afo();
        }
    }
}
