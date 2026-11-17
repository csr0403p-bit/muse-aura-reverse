package com.facebook.aura.bugreport;

import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.F60;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;
    public final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$1$2$1(MutableState<List<Uri>> mutableState, int i) {
        super(0);
        this.$imageUris$delegate = mutableState;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.BUG_REPORT_DELETE_IMAGE_BUTTON, null, null, null);
        MutableState<List<Uri>> mutableState = this.$imageUris$delegate;
        float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
        List<Uri> value = mutableState.getValue();
        int i = this.$index;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Uri uri : value) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            if (i2 != i) {
                arrayList.add(uri);
            }
            i2 = i3;
        }
        mutableState.Af8(arrayList);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
