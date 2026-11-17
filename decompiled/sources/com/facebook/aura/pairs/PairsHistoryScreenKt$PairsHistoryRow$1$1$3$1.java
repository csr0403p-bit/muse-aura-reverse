package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryRow$1$1$3$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ G0V<HatchComponent, Map<String, String>, Unit> $logMessageClick;
    public final /* synthetic */ G0W<String, String, String, Unit> $openFile;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.$logMessageClick.invoke(HatchComponent.INLINE_IMAGE, null);
        this.$openFile.invoke(str, null, PairsHistoryScreenKt.IMAGE_MIME_TYPE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsHistoryScreenKt$PairsHistoryRow$1$1$3$1(G0V<? super HatchComponent, ? super Map<String, String>, Unit> g0v, G0W<? super String, ? super String, ? super String, Unit> g0w) {
        super(2);
        this.$logMessageClick = g0v;
        this.$openFile = g0w;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
