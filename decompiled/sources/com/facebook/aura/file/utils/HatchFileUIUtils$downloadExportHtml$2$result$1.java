package com.facebook.aura.file.utils;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F0H;
import X.G0U;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchFileUIUtils$downloadExportHtml$2$result$1 extends AbstractC7559F3s implements G0U<InputStream, Uri> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $fileName;

    /* renamed from: com.facebook.aura.file.utils.HatchFileUIUtils$downloadExportHtml$2$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
        public final /* synthetic */ InputStream $body;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OutputStream outputStream) throws IOException {
            C7384Etj.A0Y(outputStream, 0);
            if (F0H.A00(this.$body, outputStream) == 0) {
                throw new IOException("Empty space export");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InputStream inputStream) {
            super(1);
            this.$body = inputStream;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
            invoke2(outputStream);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final Uri invoke(InputStream inputStream) {
        C7384Etj.A0Y(inputStream, 0);
        return HatchDownloadsWriterKt.writeToDownloads(this.$context, this.$fileName, "text/html", new AnonymousClass1(inputStream));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFileUIUtils$downloadExportHtml$2$result$1(Context context, String str) {
        super(1);
        this.$context = context;
        this.$fileName = str;
    }
}
