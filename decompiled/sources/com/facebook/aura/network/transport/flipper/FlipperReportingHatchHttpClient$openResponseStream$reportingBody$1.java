package com.facebook.aura.network.transport.flipper;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass751;
import X.G0U;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class FlipperReportingHatchHttpClient$openResponseStream$reportingBody$1 extends AbstractC7559F3s implements G0U<byte[], Unit> {
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ HatchHttpResponseStream $response;
    public final /* synthetic */ FlipperReportingHatchHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlipperReportingHatchHttpClient$openResponseStream$reportingBody$1(FlipperReportingHatchHttpClient flipperReportingHatchHttpClient, String str, HatchHttpResponseStream hatchHttpResponseStream) {
        super(1);
        this.this$0 = flipperReportingHatchHttpClient;
        this.$requestId = str;
        this.$response = hatchHttpResponseStream;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        AnonymousClass003.A0w(this.$requestId, this.$response.headers);
        synchronized (AnonymousClass751.class) {
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
        invoke2(bArr);
        return Unit.INSTANCE;
    }
}
