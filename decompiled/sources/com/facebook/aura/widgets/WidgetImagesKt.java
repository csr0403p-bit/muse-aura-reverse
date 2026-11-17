package com.facebook.aura.widgets;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.network.transport.HatchTransport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class WidgetImagesKt {
    public static final long IMAGE_TIMEOUT_MS = 10000;
    public static final long MAX_IMAGE_BYTES = 2097152;
    public static final long MAX_SOURCE_PIXELS = 16777216;
    public static final String TAG = "WidgetImages";

    /* renamed from: com.facebook.aura.widgets.WidgetImagesKt$decodeSampled$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<BitmapFactory.Options, Bitmap> {
        public final /* synthetic */ byte[] $bytes;

        @Override // X.G0U
        public final Bitmap invoke(BitmapFactory.Options options) {
            C7384Etj.A0Y(options, 0);
            byte[] bArr = this.$bytes;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byte[] bArr) {
            super(1);
            this.$bytes = bArr;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetImagesKt$decodeWidgetBitmap$2", f = "WidgetImages.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetImagesKt$decodeWidgetBitmap$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ File $file;
        public final /* synthetic */ int $targetPx;
        public int label;

        /* renamed from: com.facebook.aura.widgets.WidgetImagesKt$decodeWidgetBitmap$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<BitmapFactory.Options, Bitmap> {
            public final /* synthetic */ File $file;

            @Override // X.G0U
            public final Bitmap invoke(BitmapFactory.Options options) {
                C7384Etj.A0Y(options, 0);
                return BitmapFactory.decodeFile(this.$file.getPath(), options);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(File file) {
                super(1);
                this.$file = file;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, File file, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$targetPx = i;
            this.$file = file;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$targetPx, this.$file, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return WidgetImagesKt.decodeSampled(this.$targetPx, new AnonymousClass1(this.$file));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetImagesKt$downloadWidgetBitmap$2", f = "WidgetImages.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetImagesKt$downloadWidgetBitmap$2, reason: invalid class name and case insensitive filesystem */
    public final class C144272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ int $targetPx;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144272(String str, int i, HtJ<? super C144272> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$targetPx = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C144272(this.$url, this.$targetPx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            byte[] boundedBytes;
            HatchHttpResponse hatchHttpResponse;
            Object objExecute = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objExecute);
                    HatchHttpClient hatchHttpClientHttpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.VM_JWT);
                    HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
                    String str = this.$url;
                    Long lA0S = C3cG.A0S(10000L);
                    HatchHttpRequest hatchHttpRequest = companion.get(str, AGH.A0E(), lA0S, lA0S, lA0S, HatchRequestCategory.IMAGE, HatchRequestPurpose.FETCH, null, false, false, new HatchResponseBodyPolicy(2097152L));
                    this.label = 1;
                    objExecute = hatchHttpClientHttpClient.execute(hatchHttpRequest, this);
                    if (objExecute == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objExecute);
                }
                hatchHttpResponse = (HatchHttpResponse) objExecute;
            } catch (IOException e) {
                CFK.A0A(WidgetImagesKt.TAG, "Widget image download failed", e);
            }
            if (!hatchHttpResponse.isSuccessful) {
                CFK.A06(WidgetImagesKt.TAG, FGI.A0H("Widget image download failed: HTTP ", hatchHttpResponse.statusCode));
                return null;
            }
            InputStream inputStreamBoundedBodyStream = hatchHttpResponse.boundedBodyStream();
            if (inputStreamBoundedBodyStream != null) {
                try {
                    boundedBytes = HttpResponseBytesKt.readBoundedBytes(inputStreamBoundedBodyStream, 2097152L, -1L);
                    inputStreamBoundedBodyStream.close();
                } finally {
                }
            } else {
                boundedBytes = null;
            }
            if (boundedBytes == null) {
                return null;
            }
            return WidgetImagesKt.decodeSampled(boundedBytes, this.$targetPx);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((C144272) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Bitmap decodeSampled(byte[] bArr, int i) {
        return decodeSampled(i, new AnonymousClass1(bArr));
    }

    public static final Object decodeWidgetBitmap(File file, int i, HtJ<? super Bitmap> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(i, file, null));
    }

    public static final Object downloadWidgetBitmap(String str, int i, HtJ<? super Bitmap> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C144272(str, i, null));
    }

    public static final Bitmap decodeSampled(int i, G0U<? super BitmapFactory.Options, Bitmap> g0u) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        g0u.invoke(options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 <= 0 || i4 <= 0 || i3 * i4 > 16777216) {
            return null;
        }
        while (true) {
            int i5 = i2 * 2;
            if (Math.min(i3, i4) / i5 >= i) {
                i2 = i5;
            } else {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i2;
                return g0u.invoke(options2);
            }
        }
    }
}
