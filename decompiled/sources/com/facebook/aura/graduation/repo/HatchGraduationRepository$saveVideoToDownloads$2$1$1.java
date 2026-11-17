package com.facebook.aura.graduation.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F0H;
import X.G0U;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchGraduationRepository$saveVideoToDownloads$2$1$1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
    public final /* synthetic */ InputStream $body;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OutputStream outputStream) throws IOException {
        C7384Etj.A0Y(outputStream, 0);
        F0H.A00(this.$body, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGraduationRepository$saveVideoToDownloads$2$1$1(InputStream inputStream) {
        super(1);
        this.$body = inputStream;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
        invoke2(outputStream);
        return Unit.INSTANCE;
    }
}
