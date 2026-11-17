package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$HatchComposer$9$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $isHoldDictation$delegate;
    public final /* synthetic */ G0U<Boolean, Unit> $onMicClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$HatchComposer$9$3$2$1(Context context, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$onMicClick = g0u;
        this.$isHoldDictation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.RECORD_AUDIO"), this.$isHoldDictation$delegate);
        AnonymousClass001.A1K(MutableState.A0A((MutableState) this.$isHoldDictation$delegate), this.$onMicClick);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
