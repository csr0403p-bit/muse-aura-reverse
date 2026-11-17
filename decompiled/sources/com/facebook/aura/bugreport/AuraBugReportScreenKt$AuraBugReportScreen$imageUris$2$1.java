package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$imageUris$2$1 extends AbstractC7559F3s implements Function0<MutableState<List<? extends Uri>>> {
    public final /* synthetic */ List<Uri> $initialImages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugReportScreenKt$AuraBugReportScreen$imageUris$2$1(List<? extends Uri> list) {
        super(0);
        this.$initialImages = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MutableState<List<? extends Uri>> invoke() {
        return AnonymousClass002.A0P(this.$initialImages);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ MutableState<List<? extends Uri>> invoke() {
        return AnonymousClass002.A0P(this.$initialImages);
    }
}
