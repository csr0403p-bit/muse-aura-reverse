package X;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8185FYc extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8185FYc(Object obj, C7912FKk c7912FKk, C7925FKx c7925FKx, Context context, G0U<? super CharSequence, Unit> g0u) {
        super(1);
        this.$t = g0u;
        this.A02 = c7925FKx;
        this.A01 = c7912FKk;
        this.A00 = obj;
        this.A03 = context;
    }

    public static void A00(C7925FKx c7925FKx, C7912FKk c7912FKk, C7899FJt c7899FJt, Object[] objArr, int i) {
        c7899FJt.A00(new C8196FYn(c7925FKx, c7912FKk, i), objArr);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C9597GRd c9597GRd;
        EVS evs;
        Object obj2;
        Map map;
        C9699Ge6 c9699Ge6;
        Map mapA02;
        String str;
        AbstractC8150FWo abstractC8150FWo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        switch (this.$t) {
            case 4:
            case 5:
            case 6:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge62 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge3 = (C9698Ge3) this.A02;
                if (c9698Ge3 == null || (str7 = c9698Ge3.A04) == null) {
                    str7 = c9699Ge62.A0B;
                }
                AbstractC7607F5u.A1L(evs, str7);
                HVr.A01(evs, c9698Ge3.A09);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 7:
            case 8:
            case 9:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge63 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge32 = (C9698Ge3) this.A02;
                if (c9698Ge32 == null || (str6 = c9698Ge32.A04) == null) {
                    str6 = c9699Ge63.A0B;
                }
                AbstractC7607F5u.A1L(evs, str6);
                HVr.A01(evs, c9698Ge32.A09);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 10:
            case 11:
            case 12:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge64 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge33 = (C9698Ge3) this.A02;
                if (c9698Ge33 == null || (str5 = c9698Ge33.A04) == null) {
                    str5 = c9699Ge64.A0B;
                }
                AbstractC7607F5u.A1L(evs, str5);
                HVr.A01(evs, c9698Ge33.A09);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 13:
            case 14:
            case 16:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge65 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge34 = (C9698Ge3) this.A02;
                if (c9698Ge34 == null || (str4 = c9698Ge34.A04) == null) {
                    str4 = c9699Ge65.A0B;
                }
                AbstractC7607F5u.A1L(evs, str4);
                if (c9698Ge34 == null || (str3 = c9698Ge34.A09) == null) {
                    str3 = "ALL_PRODUCTS";
                }
                HVr.A01(evs, str3);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 15:
            case 17:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge66 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge35 = (C9698Ge3) this.A02;
                if (c9698Ge35 == null || (str2 = c9698Ge35.A04) == null) {
                    str2 = c9699Ge66.A0B;
                }
                AbstractC7607F5u.A1L(evs, str2);
                str3 = c9698Ge35.A09;
                HVr.A01(evs, str3);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 18:
            case 19:
            case 20:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge67 = (C9699Ge6) this.A03;
                C9691Gdw c9691Gdw = (C9691Gdw) this.A02;
                if (c9691Gdw == null || (str = c9691Gdw.A04) == null) {
                    str = c9699Ge67.A0B;
                }
                AbstractC7607F5u.A1L(evs, str);
                HVr.A01(evs, c9691Gdw.A03);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 21:
            case 22:
            case 23:
                evs = (EVS) obj;
                c9699Ge6 = (C9699Ge6) this.A03;
                map = (Map) this.A00;
                String strA0p = C60O.A0p("request_id", map);
                if (strA0p == null) {
                    strA0p = c9699Ge6.A0B;
                }
                AbstractC7607F5u.A1L(evs, strA0p);
                evs.A00((HVq) this.A02, "product_type");
                AbstractC7607F5u.A1K(evs, this.A01);
                mapA02 = AGH.A02(map, c9699Ge6.A0J(null).A01);
                evs.A04(mapA02);
                return evs;
            case 24:
                evs = (EVS) obj;
                InterfaceC9725Ged interfaceC9725Ged = (InterfaceC9725Ged) this.A00;
                String strAMI = interfaceC9725Ged.AMI();
                if (strAMI == null) {
                    C9699Ge6 c9699Ge68 = (C9699Ge6) this.A03;
                    C9698Ge3 c9698Ge3AJG = interfaceC9725Ged.AJG();
                    if (c9698Ge3AJG == null || (strAMI = c9698Ge3AJG.A04) == null) {
                        strAMI = c9699Ge68.A0B;
                    }
                }
                AbstractC7607F5u.A1L(evs, strAMI);
                HVr.A01(evs, interfaceC9725Ged.AJA());
                AbstractC7607F5u.A1K(evs, this.A02);
                map = (Map) this.A01;
                c9699Ge6 = (C9699Ge6) this.A03;
                mapA02 = AGH.A02(map, c9699Ge6.A0J(null).A01);
                evs.A04(mapA02);
                return evs;
            case 25:
            case 26:
                evs = (EVS) obj;
                InterfaceC9725Ged interfaceC9725Ged2 = (InterfaceC9725Ged) this.A00;
                String strAMI2 = interfaceC9725Ged2.AMI();
                if (strAMI2 == null) {
                    C9699Ge6 c9699Ge69 = (C9699Ge6) this.A03;
                    C9698Ge3 c9698Ge3AJG2 = interfaceC9725Ged2.AJG();
                    if (c9698Ge3AJG2 == null || (strAMI2 = c9698Ge3AJG2.A04) == null) {
                        strAMI2 = c9699Ge69.A0B;
                    }
                }
                AbstractC7607F5u.A1L(evs, strAMI2);
                HVr.A01(evs, interfaceC9725Ged2.AJA());
                AbstractC7607F5u.A1K(evs, this.A02);
                obj2 = this.A01;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
            case 27:
                if (obj != null && C3cI.A1W((AtomicBoolean) this.A00)) {
                    if (((AtomicBoolean) this.A03).get()) {
                        ((G0U) this.A01).invoke(obj);
                    } else {
                        ((Function0) this.A02).invoke();
                    }
                }
                return Unit.INSTANCE;
            case 28:
                C7899FJt c7899FJt = (C7899FJt) obj;
                C7384Etj.A0Y(c7899FJt, 0);
                Unit unit = Unit.INSTANCE;
                C7925FKx c7925FKx = (C7925FKx) this.A01;
                C7912FKk c7912FKk = (C7912FKk) this.A02;
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{unit}, 9);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A08}, 15);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0E}, 16);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{null}, 17);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0D}, 18);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A00}, 19);
                c7899FJt.A00(new FZJ(c7912FKk, 7), new Object[]{c7912FKk.A06});
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A07}, 20);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0F}, 21);
                A02(c7899FJt, c7912FKk.A0G, c7912FKk, 0);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{null}, 4);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0A, null}, 5);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0C}, 6);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0B}, 7);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A04}, 8);
                Object[] objArr = {c7912FKk.A05, c7912FKk.A03, Boolean.valueOf(c7912FKk.A0P), c7912FKk.A0H, Boolean.valueOf(c7912FKk.A0O), Boolean.valueOf(c7912FKk.A0R), c7912FKk.A01};
                Object obj3 = this.A00;
                c7899FJt.A00(new C8193FYk(obj3, c7925FKx, c7912FKk, 0), objArr);
                c7899FJt.A00(new FZJ(c7912FKk, 1), new Object[]{c7912FKk.A0K, c7912FKk.A0L});
                A02(c7899FJt, c7912FKk.A02, c7912FKk, 2);
                A02(c7899FJt, c7912FKk.A0N, c7912FKk, 3);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{null}, 10);
                c7899FJt.A00(new C8193FYk(c7925FKx, c7912FKk, this.A03, 1), BV4.A1Z(c7912FKk.A0Q));
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0J}, 12);
                A00(c7925FKx, c7912FKk, c7899FJt, new Object[]{c7912FKk.A0M}, 13);
                A02(c7899FJt, null, c7912FKk, 4);
                c7899FJt.A00(new C8196FYn(14, obj3, c7912FKk), new Object[]{c7912FKk.A0I});
                A02(c7899FJt, unit, c7925FKx, 5);
                A02(c7899FJt, C3cG.A0T(), c7925FKx, 6);
                return Unit.INSTANCE;
            case 29:
                GR9 gr9 = (GR9) obj;
                C7384Etj.A0Y(gr9, 0);
                MetaAiRsysSdk metaAiRsysSdk = (MetaAiRsysSdk) this.A03;
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) this.A02;
                GQX gqx = (GQX) this.A00;
                C9586GQf c9586GQf = (C9586GQf) this.A01;
                GQW gqw = c9586GQf.A0G;
                Integer numValueOf = gqw != null ? Integer.valueOf(gqw.A01) : null;
                Context contextA0I = AnonymousClass001.A0I(c9586GQf.A0E);
                synchronized (metaAiRsysSdk) {
                    AbstractC2159Azp.A0z("callReady", "%", "%%");
                    C9591GQq c9591GQq = metaAiRsysSdkRealTimeSession.A0C;
                    c9591GQq.A0C = gr9;
                    GQD gqd = c9591GQq.A01;
                    if (gqd.A00) {
                        AbstractC2159Azp.A0z("setCall: call was ended before call object was available, ending now", "%", "%%");
                        c9597GRd = (C9597GRd) gr9;
                        c9597GRd.A03.end(1, "cancelled_before_call_ready", true);
                    } else {
                        GS8 gQt = new GQt();
                        c9597GRd = (C9597GRd) gr9;
                        if (c9597GRd.A06.add(gQt)) {
                            GRD grd = c9597GRd.A00;
                            if (grd != null) {
                                gQt.AUC(c9597GRd, grd);
                            }
                            if (c9597GRd.A01) {
                                gQt.AS4(c9597GRd);
                            }
                        }
                        MediaStatsApi mediaStatsApi = (MediaStatsApi) gr9.ACQ(MediaStatsApi.CONVERTER);
                        if (mediaStatsApi != null) {
                            mediaStatsApi.registerListener(c9591GQq.A02);
                        } else {
                            mediaStatsApi = null;
                        }
                        c9591GQq.A09.set(mediaStatsApi);
                        if (mediaStatsApi == null) {
                            AbstractC7608F5v.A1L("No MediaStatsApi on the call; link quality will not be reported");
                        }
                        Iterator<G0U<GR9, Unit>> it = gqd.A01.iterator();
                        while (it.hasNext()) {
                            it.next().invoke(gr9);
                        }
                    }
                    ConcurrentLinkedQueue<G0U<GR9, Unit>> concurrentLinkedQueue = gqd.A01;
                    concurrentLinkedQueue.clear();
                    c9591GQq.A06.clear();
                    c9591GQq.A05.clear();
                    if (gqx.A03) {
                        metaAiRsysSdkRealTimeSession.Adk(false);
                    }
                    boolean z = metaAiRsysSdkRealTimeSession.A0i || (numValueOf != null && numValueOf.intValue() == 39 && gqx.A02);
                    if (!(gqx instanceof C8968Fup) && z) {
                        int i = metaAiRsysSdkRealTimeSession.A06;
                        AudioManager audioManager = (AudioManager) AbstractC7609F5w.A0o(contextA0I);
                        if (audioManager.getStreamVolume(i) <= audioManager.getStreamMinVolume(i)) {
                            metaAiRsysSdkRealTimeSession.Acv(false);
                        }
                    }
                    if (gqx.A02) {
                        metaAiRsysSdkRealTimeSession.A00 = (AudioManager) AbstractC7609F5w.A0o(contextA0I);
                        AnonymousClass001.A1J(new C8899FtG(contextA0I, metaAiRsysSdkRealTimeSession, (Context) null, (HtJ<? super C8899FtG>) 16), metaAiRsysSdkRealTimeSession.A0X);
                    }
                    boolean z2 = gqx.A01;
                    if (z2 && metaAiRsysSdkRealTimeSession.A09.A01 && metaAiRsysSdkRealTimeSession.A02 == null) {
                        AudioManager audioManager2 = (AudioManager) AbstractC7609F5w.A0o(contextA0I);
                        GQP gqp = new GQP();
                        C7384Etj.A0Y(audioManager2, 0);
                        C9621GSq c9621GSq = C9621GSq.A0F;
                        if (c9621GSq == null) {
                            c9621GSq = new C9621GSq(audioManager2, gqp);
                            C9621GSq.A0F = c9621GSq;
                        }
                        c9621GSq.A02((G0U) metaAiRsysSdkRealTimeSession.A0O.getValue(), FZS.A02(metaAiRsysSdkRealTimeSession, 38));
                        metaAiRsysSdkRealTimeSession.A02 = c9621GSq;
                    }
                    C8631Fhi c8631FhiA00 = C8631Fhi.A00(31);
                    GR9 gr92 = c9591GQq.A0C;
                    if (gr92 != null) {
                        c8631FhiA00.invoke(gr92);
                    } else {
                        AbstractC7608F5v.A1L("RemoveWhenEnded called before call object is available. Caching the action to execute later");
                        concurrentLinkedQueue.add(c8631FhiA00);
                    }
                    MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession2 = z2 ? metaAiRsysSdkRealTimeSession : null;
                    String str10 = c9597GRd.A05;
                    String strA0M = FGI.A0M("Monitoring started session: ", str10);
                    C7384Etj.A0Y(strA0M, 1);
                    AbstractC7608F5v.A1L(strA0M);
                    HoC hoC = metaAiRsysSdk.A00;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    metaAiRsysSdk.A00 = null;
                    if (metaAiRsysSdkRealTimeSession2 != null) {
                        C8197FYo c8197FYo = new C8197FYo(26, metaAiRsysSdk, gr9);
                        if (metaAiRsysSdkRealTimeSession2.A09.A01 && metaAiRsysSdkRealTimeSession2.A0J.compareAndSet(false, true)) {
                            AnonymousClass001.A1J(new C8899FtG(c8197FYo, metaAiRsysSdkRealTimeSession2, (Context) null, (HtJ<? super C8899FtG>) 15), (C3UX) metaAiRsysSdkRealTimeSession2.A0R.getValue());
                        }
                    } else {
                        metaAiRsysSdk.A00 = AnonymousClass001.A11(new C8899FtG((Object) gr9, (MetaAiRsysSdkRealTimeSession) metaAiRsysSdk, (Context) null, (HtJ<? super C8899FtG>) 13), Hxb.A02(metaAiRsysSdk.A06));
                    }
                    Set<String> set = metaAiRsysSdk.A05;
                    if (set.contains(str10)) {
                        AbstractC2159Azp.A0z("Session UI closed before session ready, ending session.", "%", "%%");
                        set.remove(str10);
                        c9591GQq.A02(1, "call_ui_closed_before_session_ready");
                    }
                }
                return Unit.INSTANCE;
            case 30:
                C9621GSq c9621GSq2 = (C9621GSq) this.A03;
                c9621GSq2.A08.post(new RunnableC9622GSr((GSw) this.A02, c9621GSq2, (Integer) obj, (HxE) this.A00, (G0U) this.A01));
                return Unit.INSTANCE;
            default:
                evs = (EVS) obj;
                C9699Ge6 c9699Ge610 = (C9699Ge6) this.A03;
                C9698Ge3 c9698Ge36 = (C9698Ge3) this.A02;
                if (c9698Ge36 == null || (str8 = c9698Ge36.A04) == null) {
                    str8 = c9699Ge610.A0B;
                }
                AbstractC7607F5u.A1L(evs, str8);
                if (c9698Ge36 == null || (str9 = c9698Ge36.A09) == null) {
                    str9 = "ALL_PRODUCTS";
                }
                HVr.A01(evs, str9);
                abstractC8150FWo = (AbstractC8150FWo) this.A01;
                evs.A01(abstractC8150FWo, "event_payload");
                obj2 = this.A00;
                mapA02 = (Map) obj2;
                evs.A04(mapA02);
                return evs;
        }
    }

    public static void A02(C7899FJt c7899FJt, Object obj, Object obj2, int i) {
        c7899FJt.A00(new FZJ(obj2, i), new Object[]{obj});
    }
}
