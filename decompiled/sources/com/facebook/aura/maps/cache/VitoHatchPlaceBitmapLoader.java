package com.facebook.aura.maps.cache;

import X.AbstractC07127nr;
import X.AbstractC7204EiM;
import X.AnonymousClass001;
import X.B15;
import X.C06H;
import X.C3UX;
import X.C60O;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C7481Exe;
import X.C7Bm;
import X.EfF;
import X.EjN;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7064EfB;
import X.InterfaceC7236Ej0;
import X.InterfaceC7237Ej1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VitoHatchPlaceBitmapLoader implements HatchPlaceBitmapLoader {
    public static final ExecutorService BITMAP_COPY_EXECUTOR;
    public static final CallerContext CALLER_CONTEXT;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int PLACE_IMAGE_DECODE_SIZE_PX = 512;
    public static final C7197Ei9 PLACE_IMAGE_OPTIONS;
    public final Context context;

    public final class Companion {
        public final ExecutorService getBITMAP_COPY_EXECUTOR() {
            return VitoHatchPlaceBitmapLoader.BITMAP_COPY_EXECUTOR;
        }

        public final CallerContext getCALLER_CONTEXT() {
            return VitoHatchPlaceBitmapLoader.CALLER_CONTEXT;
        }

        public final C7197Ei9 getPLACE_IMAGE_OPTIONS() {
            return VitoHatchPlaceBitmapLoader.PLACE_IMAGE_OPTIONS;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.maps.cache.VitoHatchPlaceBitmapLoader$load$2", f = "HatchMapAgenticSceneFlowCache.kt", l = {451}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.maps.cache.VitoHatchPlaceBitmapLoader$load$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ String $imageUrl;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$imageUrl = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VitoHatchPlaceBitmapLoader.this.new AnonymousClass2(this.$imageUrl, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj;
            }
            Hwg.A00(obj);
            VitoHatchPlaceBitmapLoader vitoHatchPlaceBitmapLoader = VitoHatchPlaceBitmapLoader.this;
            String str = this.$imageUrl;
            this.L$0 = vitoHatchPlaceBitmapLoader;
            this.L$1 = str;
            this.label = 1;
            final GBL gblA04 = C7Bm.A04(this);
            InterfaceC7237Ej1 interfaceC7237Ej1A02 = EjN.A02();
            ExecutorService executorService = VitoHatchPlaceBitmapLoader.BITMAP_COPY_EXECUTOR;
            Resources resources = vitoHatchPlaceBitmapLoader.context.getResources();
            C7384Etj.A0U(resources);
            final InterfaceC7236Ej0 interfaceC7236Ej0ABM = interfaceC7237Ej1A02.ABM(null, interfaceC7237Ej1A02.A7p(resources, null, null, VitoHatchPlaceBitmapLoader.PLACE_IMAGE_OPTIONS, B15.A01(str), null), null, VitoHatchPlaceBitmapLoader.CALLER_CONTEXT, str.hashCode());
            interfaceC7236Ej0ABM.Agc(new AbstractC7204EiM() { // from class: com.facebook.aura.maps.cache.VitoHatchPlaceBitmapLoader$load$2$1$1
                @Override // X.AbstractC7209EiU
                public void onFailureImpl(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
                    C7384Etj.A0Y(interfaceC7236Ej0, 0);
                    if (gblA04.isActive()) {
                        gblA04.Abe(null, VitoHatchPlaceBitmapLoader$load$2$1$1$onFailureImpl$1.INSTANCE);
                    }
                    interfaceC7236Ej0.A6Q();
                }

                @Override // X.AbstractC7204EiM
                public void onNewResultImpl(Bitmap bitmap) {
                    if (gblA04.isActive()) {
                        Bitmap bitmapCopy = null;
                        if (bitmap != null) {
                            try {
                                bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                            } catch (Exception unused) {
                            }
                            gblA04.Abe(bitmapCopy, VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$2.INSTANCE);
                            interfaceC7236Ej0ABM.A6Q();
                            return;
                        }
                        gblA04.Abe(null, VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$1.INSTANCE);
                    }
                    interfaceC7236Ej0ABM.A6Q();
                }
            }, VitoHatchPlaceBitmapLoader.BITMAP_COPY_EXECUTOR);
            gblA04.AO2(new VitoHatchPlaceBitmapLoader$load$2$1$2(interfaceC7236Ej0ABM));
            Object objA0F = gblA04.A0F();
            return objA0F == enumC10460Hji ? enumC10460Hji : objA0F;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VitoHatchPlaceBitmapLoader(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
    }

    static {
        if ("HatchSharedPlaceImageProvider".isEmpty()) {
            throw C60O.A0i("callingClassName for the CallerContext cannot be null nor empty.");
        }
        CALLER_CONTEXT = new CallerContext(null, "HatchSharedPlaceImageProvider");
        BITMAP_COPY_EXECUTOR = AuraExecutors.INSTANCE.getBackgroundThreadExecutor();
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        ((C7195Ei7) c7196Ei8A00).A06 = new C7481Exe(512, 512);
        PLACE_IMAGE_OPTIONS = new C7197Ei9(c7196Ei8A00);
    }

    @Override // com.facebook.aura.maps.cache.HatchPlaceBitmapLoader
    public Object load(String str, HtJ<? super Bitmap> htJ) {
        return GAo.A00(htJ, AuraDispatchers.main, new AnonymousClass2(str, null));
    }
}
