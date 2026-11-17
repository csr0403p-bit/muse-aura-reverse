package X;

import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioSourceSink;
import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GQq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9591GQq {
    public static final ArrayList<String> A0E = C60O.A11(0);
    public VideoRenderSurface A00;
    public final GQD A01;
    public final MediaStatsListener A02;
    public final Object A03;
    public final String A04;
    public final Map<AudioSourceSink, G0U<GR9, Unit>> A05;
    public final Map<GQY, G0U<GR9, Unit>> A06;
    public final Map<GQY, Function0<Unit>> A07;
    public final Set<GQY> A08;
    public final AtomicReference<MediaStatsApi> A09;
    public final BLG<List<MediaStats>> A0A;
    public final C1BN<List<MediaStats>> A0B;
    public volatile GR9 A0C;
    public volatile G0U<? super AudioFrame, Integer> A0D;

    public C9591GQq(String str) {
        C7384Etj.A0Y(str, 0);
        this.A04 = str;
        this.A01 = new GQD();
        this.A06 = Collections.synchronizedMap(C3cG.A0j());
        this.A05 = Collections.synchronizedMap(C3cG.A0j());
        this.A03 = C3cG.A0T();
        this.A07 = C3cG.A0j();
        this.A08 = C3cG.A0k();
        C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
        this.A0A = c9286GCnA01;
        this.A0B = C3cG.A11(c9286GCnA01);
        this.A09 = BV4.A16(null);
        this.A02 = new C9593GQs(this);
    }

    public final void A01() {
        List listA0X;
        this.A0D = null;
        MediaStatsApi andSet = this.A09.getAndSet(null);
        if (andSet != null) {
            andSet.unregisterListener(this.A02);
        }
        this.A0A.Af8(C0881AGi.A00);
        this.A01.A01.clear();
        this.A06.clear();
        this.A05.clear();
        synchronized (this.A03) {
            Map<GQY, Function0<Unit>> map = this.A07;
            listA0X = AbstractC0878AGe.A0X(map.values());
            map.clear();
            this.A08.clear();
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            BV7.A1M(it);
        }
        VideoRenderSurface videoRenderSurface = this.A00;
        if (videoRenderSurface != null) {
            videoRenderSurface.setRenderItems(C3cG.A0h());
        }
        this.A00 = null;
    }

    public final void A02(int i, String str) {
        this.A0D = null;
        GR6 gr6 = new GR6(i, str);
        GR9 gr9 = this.A0C;
        if (gr9 != null) {
            gr6.invoke(gr9);
            return;
        }
        AbstractC7608F5v.A1L("End called before call object is available. Caching the action to execute later");
        GQD gqd = this.A01;
        gqd.A01.add(gr6);
        gqd.A00 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.GQY r5, X.C9591GQq r6, X.GR9 r7, com.facebook.rsys.videorender.gen.VideoRenderApi r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            if (r9 == 0) goto L11
            if (r10 == 0) goto L11
            int r0 = r9.intValue()
            if (r0 <= 0) goto L11
            int r1 = r10.intValue()
            r0 = 1
            if (r1 > 0) goto L12
        L11:
            r0 = 0
        L12:
            r4 = 0
            if (r0 == 0) goto L37
            X.GRd r7 = (X.C9597GRd) r7
            X.GRD r0 = r7.A00
            if (r0 == 0) goto L37
            X.G50<com.facebook.rsys.call.gen.CallModel> r1 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.GR7 r0 = (X.GR7) r0
            X.G4z r0 = r0.A00
            java.lang.Object r0 = r0.A01(r1)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            if (r0 == 0) goto L37
            java.util.ArrayList<com.facebook.rsys.call.gen.CallParticipant> r1 = r0.remoteParticipants
            if (r1 == 0) goto L37
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L38
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L38
        L37:
            return r4
        L38:
            java.util.Iterator r2 = r1.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r2.next()
            com.facebook.rsys.call.gen.CallParticipant r1 = (com.facebook.rsys.call.gen.CallParticipant) r1
            java.lang.String r0 = r1.userId
            java.lang.String r3 = r5.A00
            boolean r0 = X.C7384Etj.areEqual(r0, r3)
            if (r0 == 0) goto L3c
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r1.mediaState
            java.util.ArrayList<com.facebook.rsys.video.gen.VideoStream> r0 = r0.videoStreams
            X.C7384Etj.A0T(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            java.lang.Object r1 = r6.A03
            monitor-enter(r1)
            java.util.Set<X.GQY> r0 = r6.A08     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.add(r5)     // Catch: java.lang.Throwable -> Lb2
            r2 = 1
            if (r0 == 0) goto L73
            java.util.Map<X.GQY, kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r6.A07     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r0.remove(r5)     // Catch: java.lang.Throwable -> Lb2
            r4 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            monitor-exit(r1)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L7c
            r0.invoke()
        L7c:
            if (r4 == 0) goto La7
            if (r9 == 0) goto Lad
            int r1 = r9.intValue()
            if (r10 == 0) goto La8
            int r0 = r10.intValue()
            r8.setDisplayResolution(r3, r2, r1, r0)
            java.lang.String r0 = "Set peer display resolution after participant video stream ready userId="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r3)
            java.lang.String r0 = " width="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " height="
            java.lang.String r0 = X.AnonymousClass006.A0y(r10, r0, r1)
            X.C7384Etj.A0Y(r0, r2)
            X.AbstractC7608F5v.A1L(r0)
        La7:
            return r2
        La8:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        Lad:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        Lb2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9591GQq.A00(X.GQY, X.GQq, X.GR9, com.facebook.rsys.videorender.gen.VideoRenderApi, java.lang.Integer, java.lang.Integer):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r6 = this;
            X.GR9 r5 = r6.A0C
            if (r5 == 0) goto L48
            X.GRd r5 = (X.C9597GRd) r5
            boolean r0 = r5.A01
            r4 = 1
            if (r0 != 0) goto L51
            java.lang.Integer r2 = X.BV4.A0Y()
            java.lang.Integer r1 = X.BV4.A0Z()
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r1, r0}
            java.util.Set r2 = X.BFI.A0H(r0)
            X.GRD r0 = r5.A00
            if (r0 == 0) goto L41
            X.G50<com.facebook.rsys.state.gen.State> r1 = com.facebook.rsys.state.gen.State.CONVERTER
            X.GR7 r0 = (X.GR7) r0
            X.G4z r0 = r0.A00
            java.lang.Object r0 = r0.A01(r1)
            if (r0 == 0) goto L43
            com.facebook.rsys.state.gen.State r0 = (com.facebook.rsys.state.gen.State) r0
            if (r0 == 0) goto L41
            int r0 = r0.callState
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3a:
            boolean r0 = X.AbstractC0878AGe.A0k(r2, r0)
            if (r0 != 0) goto L51
            return r3
        L41:
            r0 = 0
            goto L3a
        L43:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        L48:
            java.lang.String r0 = "IsEndingEndedOrIdle called before call object is available. Returning cached value"
            X.AbstractC7608F5v.A1L(r0)
            X.GQD r0 = r6.A01
            boolean r4 = r0.A00
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9591GQq.A03():boolean");
    }
}
