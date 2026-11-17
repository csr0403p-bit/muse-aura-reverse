package X;

import X.InterfaceC9011Fwo;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fwy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9021Fwy<T extends InterfaceC9011Fwo> implements InterfaceC9032FxD<T, List<? extends C9024Fx2>> {
    public final C9018Fwv A00;
    public final Duration A01;
    public final Map<Instant, C9022Fwz<T>> A02;
    public final Fx6<?> A03;
    public final G0U<C9018Fwv, InterfaceC9026Fx4<T>> A04;

    @Override // X.InterfaceC9032FxD
    public final void ABO(T t) {
        Instant instantAKy;
        Instant instantPlus;
        C7384Etj.A0Y(t, 0);
        C9019Fww c9019Fww = C9019Fww.A00;
        if (c9019Fww.A03(this.A03, t)) {
            C9018Fwv c9018Fwv = this.A00;
            Instant instant = c9018Fwv.A01;
            boolean z = t instanceof Fx5;
            if (z) {
                instantAKy = ((Fx5) t).ALd();
            } else {
                if (!(t instanceof InterfaceC9020Fwx)) {
                    throw AbstractC7607F5u.A10(t, "Unsupported value for aggregation: ");
                }
                instantAKy = ((InterfaceC9020Fwx) t).AKy();
            }
            Duration duration = this.A01;
            Instant instantPlus2 = instant.plus((TemporalAmount) duration.multipliedBy(Duration.between(instant, instantAKy).dividedBy(duration)));
            C7384Etj.A0U(instantPlus2);
            if (instant.compareTo(instantPlus2) >= 0) {
                instantPlus2 = instant;
            }
            if (z) {
                instantPlus = instantPlus2;
            } else {
                if (!(t instanceof InterfaceC9020Fwx)) {
                    throw AbstractC7607F5u.A10(t, "Unsupported value for aggregation: ");
                }
                instantPlus = instant.plus((TemporalAmount) duration.multipliedBy(Duration.between(instant, ((InterfaceC9020Fwx) t).AFC()).dividedBy(duration)));
                C7384Etj.A0U(instantPlus);
            }
            while (instantPlus2.compareTo(instantPlus) <= 0) {
                Instant instant2 = c9018Fwv.A00;
                if (instantPlus2.compareTo(instant2) >= 0) {
                    return;
                }
                Instant instantPlus3 = instantPlus2.plus((TemporalAmount) duration);
                C7384Etj.A0U(instantPlus3);
                if (instantPlus3.compareTo(instant2) <= 0) {
                    instant2 = instantPlus3;
                }
                C9018Fwv c9018Fwv2 = new C9018Fwv(instantPlus2, instant2);
                if (c9019Fww.A03(c9018Fwv2, t)) {
                    Map<Instant, C9022Fwz<T>> map = this.A02;
                    C9022Fwz<T> c9022Fwz = map.get(instantPlus2);
                    if (c9022Fwz == null) {
                        c9022Fwz = new C9022Fwz<>(this.A04.invoke(c9018Fwv2), instantPlus2);
                        map.put(instantPlus2, c9022Fwz);
                    }
                    c9022Fwz.AYb(t);
                }
                instantPlus2 = instantPlus2.plus((TemporalAmount) duration);
                C7384Etj.A0U(instantPlus2);
            }
        }
    }

    @Override // X.InterfaceC9032FxD
    public final /* bridge */ /* synthetic */ List<? extends C9024Fx2> AJm() {
        Collection<C9022Fwz<T>> collectionValues = this.A02.values();
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        for (C9022Fwz<T> c9022Fwz : collectionValues) {
            Instant instant = c9022Fwz.A03;
            Instant instantPlus = instant.plus((TemporalAmount) this.A01);
            C7384Etj.A0U(instantPlus);
            Instant instant2 = this.A00.A00;
            if (instantPlus.compareTo(instant2) <= 0) {
                instant2 = instantPlus;
            }
            ZoneOffset offset = c9022Fwz.A01;
            if (offset == null) {
                ZoneRules rules = ZoneId.systemDefault().getRules();
                Instant instantNow = c9022Fwz.A00;
                if (instantNow == null) {
                    instantNow = Instant.now();
                }
                offset = rules.getOffset(instantNow);
            }
            C8990FwS c8990FwSAJ8 = c9022Fwz.A02.AJ8();
            C7384Etj.A0X(offset);
            C9030FxB c9030FxB = new C9030FxB(c8990FwSAJ8, instant, instant2, offset, false);
            Instant instant3 = c9022Fwz.A00;
            if (instant3 == null) {
                instant3 = Instant.MAX;
            }
            C7384Etj.A0X(instant3);
            arrayListA0i.add(new C9024Fx2(c9030FxB, instant3));
        }
        return arrayListA0i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9021Fwy(Fx6<?> fx6, Duration duration, G0U<? super C9018Fwv, ? extends InterfaceC9026Fx4<T>> g0u) {
        C9018Fwv c9018Fwv;
        this.A03 = fx6;
        this.A01 = duration;
        this.A04 = g0u;
        if (fx6 instanceof C9018Fwv) {
            c9018Fwv = (C9018Fwv) fx6;
        } else {
            if (!(fx6 instanceof C9017Fwu)) {
                throw C3cG.A0q();
            }
            C9017Fwu c9017Fwu = (C9017Fwu) fx6;
            Instant instant = c9017Fwu.A01.toInstant(ZoneOffset.MAX);
            C7384Etj.A0U(instant);
            Instant instant2 = c9017Fwu.A00.toInstant(ZoneOffset.MIN);
            C7384Etj.A0U(instant2);
            c9018Fwv = new C9018Fwv(instant, instant2);
        }
        this.A00 = c9018Fwv;
        this.A02 = C3cG.A0j();
    }
}
