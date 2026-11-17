package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import X.G0V;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HtmlSpacesWebViewKt$SpacesShareBridgeEffect$shareBridge$1$1 extends AbstractC7559F3s implements G0V<String, byte[], File> {
    public final /* synthetic */ Context $appContext;

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$shareBridge$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
        public final /* synthetic */ byte[] $bytes;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OutputStream outputStream) throws IOException {
            C7384Etj.A0Y(outputStream, 0);
            outputStream.write(this.$bytes);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byte[] bArr) {
            super(1);
            this.$bytes = bArr;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
            invoke2(outputStream);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$SpacesShareBridgeEffect$shareBridge$1$1(Context context) {
        super(2);
        this.$appContext = context;
    }

    @Override // X.G0V
    public final File invoke(String str, byte[] bArr) {
        AnonymousClass003.A0u(str, bArr);
        return C8j4.A0k(this.$appContext).storeNamed(str, new AnonymousClass1(bArr));
    }
}
