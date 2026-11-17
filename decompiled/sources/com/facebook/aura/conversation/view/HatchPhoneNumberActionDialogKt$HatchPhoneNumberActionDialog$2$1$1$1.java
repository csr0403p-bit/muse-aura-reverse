package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onCallClick;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ String $phoneUrl;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPhoneNumberActionDialogKt$HatchPhoneNumberActionDialog$2$1$1$1(HatchScreen hatchScreen, Map<String, String> map, G0U<? super String, Unit> g0u, String str, Function0<Unit> function0) {
        super(0);
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$onCallClick = g0u;
        this.$phoneUrl = str;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPhoneNumberActionDialogKt.logPhoneActionClick(this.$screen, HatchComponent.CALL, this.$threadLogMetadata);
        this.$onCallClick.invoke(this.$phoneUrl);
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
