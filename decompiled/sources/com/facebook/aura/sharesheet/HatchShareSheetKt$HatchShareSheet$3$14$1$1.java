package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C0dx;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$3$14$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ String $link;
    public final /* synthetic */ HatchShareLogContext $logContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$3$14$1$1(HatchShareLogContext hatchShareLogContext, Context context, String str, C0dx c0dx) {
        super(0);
        this.$logContext = hatchShareLogContext;
        this.$context = context;
        this.$link = str;
        this.$haptics = c0dx;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchShareLogging.INSTANCE.logDestination(HatchShareDestination.COPY_LINK, this.$logContext);
        HatchShareSheetKt.copyLinkToClipboard(this.$context, this.$link, this.$haptics);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
