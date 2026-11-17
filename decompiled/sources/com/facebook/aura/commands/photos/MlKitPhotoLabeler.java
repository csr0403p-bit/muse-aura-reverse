package com.facebook.aura.commands.photos;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3555CTs;
import X.C3665CcL;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.CRz;
import X.CS5;
import X.CWZ;
import X.F0C;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC3000Brb;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.commands.photos.PhotoLabelResult;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class MlKitPhotoLabeler {
    public static final MlKitPhotoLabeler INSTANCE = new MlKitPhotoLabeler();
    public static final AtomicBoolean initialized = C60O.A1E();
    public static final F0C labeler$delegate = AbstractC5321DgF.A03(MlKitPhotoLabeler$labeler$2.INSTANCE);

    @DebugMetadata(c = "com.facebook.aura.commands.photos.MlKitPhotoLabeler$labelsFor$2", f = "MlKitPhotoLabeler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.MlKitPhotoLabeler$labelsFor$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PhotoLabelResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$uri = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$uri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            Object labels;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MlKitPhotoLabeler mlKitPhotoLabeler = MlKitPhotoLabeler.INSTANCE;
            mlKitPhotoLabeler.ensureInitialized(this.$context);
            PhotoBitmaps photoBitmaps = PhotoBitmaps.INSTANCE;
            Bitmap bitmapLoadThumbnail = photoBitmaps.loadThumbnail(this.$context, this.$uri, 256);
            if (bitmapLoadThumbnail == null && (bitmapLoadThumbnail = photoBitmaps.decodeBounded(this.$context, this.$uri, 512)) == null) {
                return PhotoLabelResult.Failed.INSTANCE;
            }
            int iExifRotationDegrees = 0;
            Bitmap bitmapCenterCropSquare = photoBitmaps.centerCropSquare(bitmapLoadThumbnail, 256);
            try {
                if (bitmapLoadThumbnail == null) {
                    try {
                        iExifRotationDegrees = photoBitmaps.exifRotationDegrees(this.$context, this.$uri);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        if (mlKitPhotoLabeler.isModelUnavailable(th)) {
                            CFK.A05(MlKitPhotoLabelerKt.TAG, "Image labeling model is not downloaded yet");
                            labels = PhotoLabelResult.ModelNotReady.INSTANCE;
                        } else {
                            CFK.A06(MlKitPhotoLabelerKt.TAG, C60O.A0r("labelsFor failed (", C3cI.A0Y(th)));
                            labels = PhotoLabelResult.Failed.INSTANCE;
                        }
                    }
                }
                InterfaceC3000Brb interfaceC3000Brb = (InterfaceC3000Brb) C7384Etj.A0G(MlKitPhotoLabeler.labeler$delegate);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C3665CcL c3665CcL = new C3665CcL(iExifRotationDegrees, bitmapCenterCropSquare);
                C3665CcL.A01(-1, 1, bitmapCenterCropSquare.getHeight(), bitmapCenterCropSquare.getWidth(), bitmapCenterCropSquare.getAllocationByteCount(), iExifRotationDegrees, jElapsedRealtime);
                Object objA00 = CRz.A00(((CWZ) interfaceC3000Brb).A00(c3665CcL), TimeUnit.MILLISECONDS, 5000L);
                C7384Etj.A0U(objA00);
                List listA0c = AbstractC0878AGe.A0c((Iterable) objA00, new Comparator() { // from class: com.facebook.aura.commands.photos.MlKitPhotoLabeler$labelsFor$2$invokeSuspend$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return Float.valueOf(((CS5) t2).A00).compareTo(Float.valueOf(((CS5) t).A00));
                    }
                });
                ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
                Iterator it = listA0c.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((CS5) it.next()).A02);
                }
                labels = new PhotoLabelResult.Labels(arrayListA0i);
                return labels;
            } finally {
                if (bitmapCenterCropSquare != bitmapLoadThumbnail) {
                    bitmapCenterCropSquare.recycle();
                }
                bitmapLoadThumbnail.recycle();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PhotoLabelResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final /* synthetic */ InterfaceC3000Brb access$getLabeler(MlKitPhotoLabeler mlKitPhotoLabeler) {
        return (InterfaceC3000Brb) C7384Etj.A0G(labeler$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureInitialized(Context context) {
        Object objA0s;
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            C3555CTs.A01(context.getApplicationContext());
            objA0s = Unit.INSTANCE;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (!(objA0s instanceof C10571Hud)) {
            atomicBoolean.set(true);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A06(MlKitPhotoLabelerKt.TAG, FGI.A0M("MlKit.initialize failed: ", thA00.getMessage()));
        }
    }

    private final InterfaceC3000Brb getLabeler() {
        return (InterfaceC3000Brb) C7384Etj.A0G(labeler$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isModelUnavailable(Throwable th) {
        MlKitException mlKitException;
        while (th != null) {
            if ((th instanceof MlKitException) && (mlKitException = (MlKitException) th) != null) {
                int i = mlKitException.zza;
                Integer numValueOf = Integer.valueOf(i);
                if (i == 14 || numValueOf.intValue() == 5) {
                    return true;
                }
            }
            th = th.getCause();
        }
        return false;
    }

    public final Object labelsFor(Context context, Uri uri, HtJ<? super PhotoLabelResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, uri, null));
    }
}
