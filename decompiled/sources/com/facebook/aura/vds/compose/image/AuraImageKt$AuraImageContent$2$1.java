package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.C7506EyQ;
import X.Ejq;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraImageKt$AuraImageContent$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Ejq> $effectiveSource$delegate;
    public final /* synthetic */ Uri $thumbUri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageKt$AuraImageContent$2$1(Uri uri, MutableState<Ejq> mutableState) {
        super(0);
        this.$thumbUri = uri;
        this.$effectiveSource$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Uri uriRawUriFor = AuraImageNetworkFetcherKt.rawUriFor(this.$thumbUri);
        if (uriRawUriFor != null) {
            this.$effectiveSource$delegate.Af8(new C7506EyQ(null, uriRawUriFor));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
