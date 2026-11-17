package X;

import android.os.SystemClock;
import android.os.Trace;
import android.util.LruCache;
import com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class DXW {
    public int A00;
    public final C5605Dlk A02;
    public final DXV A03;
    public final C5668Dmx A04;
    public final HeroPlayerSetting A05;
    public final LruCache<Long, Integer> A09;
    public final AtomicLong A08 = BV4.A14(SystemClock.elapsedRealtime());
    public final Queue<String> A07 = BV4.A0y();
    public String A01 = "";
    public final Queue<Dlw> A06 = new ConcurrentLinkedQueue();

    public DXW(C5605Dlk c5605Dlk, C5668Dmx c5668Dmx, HeroPlayerSetting heroPlayerSetting) {
        String str;
        this.A00 = 100;
        this.A05 = heroPlayerSetting;
        this.A02 = c5605Dlk;
        int i = heroPlayerSetting.playerPoolSize;
        i = i <= 0 ? 4 : i;
        this.A09 = new LruCache<>(i);
        Dlv dlv = heroPlayerSetting.gen;
        if (dlv.enable_player_pooling_with_priority) {
            this.A03 = new C2988Br0(this, i);
            str = "create HeroPlayerPoolPriorityCache";
        } else {
            long j = dlv.max_hero_service_player_reuse_pool_size;
            long j2 = dlv.eager_recover_strategy_for_pool;
            if (j > 0) {
                this.A03 = new DXX(this, this, i, (int) j2, j, heroPlayerSetting.fixHeroPlayerPoolRestoreLeak, heroPlayerSetting.enableReservedWarmupPriority);
                str = "create ReuseHeroPlayerPoolLruCache";
            } else {
                this.A03 = new CMu(this, i, (int) j2, heroPlayerSetting.fixHeroPlayerPoolRestoreLeak, heroPlayerSetting.enableReservedWarmupPriority);
                str = "create HeroPlayerPoolLruCache";
            }
        }
        A04(str, -1L);
        long j3 = heroPlayerSetting.gen.hero_pool_max_number_of_logs;
        if (j3 > 0) {
            this.A00 = (int) j3;
        }
        this.A04 = c5668Dmx;
    }

    public static void A01(DXW dxw) {
        DXV dxv = dxw.A03;
        Iterator itA0n = AnonymousClass002.A0n(dxv.A04());
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Dlw dlw = (Dlw) entryA0l.getValue();
            if (dxw.A05.gen.refresh_players_play_when_ready ? dlw.A2v : dlw.A2x) {
                dxv.A03((Long) entryA0l.getKey());
                dxw.A04("get", C3cG.A05(entryA0l.getKey()));
            }
        }
    }

    public final Dlw A02(long j) {
        Dlw dlwA03 = this.A03.A03(Long.valueOf(j));
        A04("get", j);
        return dlwA03;
    }

    public final void A03(long j, boolean z) {
        Trace.beginSection("HeroServicePlayerPool.releasePlayer");
        try {
            Long lValueOf = Long.valueOf(j);
            AbstractC5718DoA.A02("id [%d]: Release player", lValueOf);
            if (z && j > 0 && A02(j) != null) {
                A02(j).A1T(new DoB());
            }
            this.A03.A06(lValueOf, "releasePlayer");
            A04("remove", j);
            AbstractC5718DoA.A02("HeroServicePlayerPool", "releasePlayer HeroServicePlayer[%d] released: %s", lValueOf, true);
        } finally {
            Trace.endSection();
        }
    }

    public final void A04(String str, long j) {
        int size;
        int iMaxSize;
        if (this.A05.gen.enable_hero_pool_log) {
            Locale locale = Locale.US;
            DXV dxv = this.A03;
            boolean z = dxv instanceof C2988Br0;
            if (z) {
                C2988Br0 c2988Br0 = (C2988Br0) dxv;
                synchronized (dxv) {
                    size = c2988Br0.A02.size();
                }
            } else {
                size = ((CMu) dxv).A02.size();
            }
            Integer numValueOf = Integer.valueOf(size);
            if (z) {
                C2988Br0 c2988Br02 = (C2988Br0) dxv;
                synchronized (dxv) {
                    iMaxSize = c2988Br02.A00;
                }
            } else {
                iMaxSize = ((CMu) dxv).A02.maxSize();
            }
            String str2 = String.format(locale, ", currentSize:%d, maxSize: %d, %s: playerId %d", numValueOf, Integer.valueOf(iMaxSize), str, Long.valueOf(j));
            if (str2.equals(this.A01)) {
                return;
            }
            this.A01 = str2;
            String strA0M = FGI.A0M(new SimpleDateFormat(AuraHtmlDiagnosticsBugReportContributor.TIMESTAMP_FORMAT, locale).format(new Date()), str2);
            AbstractC3426CMt.A02("HeroServicePlayerPool", strA0M);
            Queue<String> queue = this.A07;
            synchronized (queue) {
                queue.add(strA0M);
                if (queue.size() > this.A00) {
                    queue.poll();
                }
            }
        }
    }

    public static Dlw A00(C5616Dlx c5616Dlx, String str, Object[] objArr, long j) {
        AbstractC5718DoA.A02(str, objArr);
        return c5616Dlx.A0Z.A02(j);
    }
}
