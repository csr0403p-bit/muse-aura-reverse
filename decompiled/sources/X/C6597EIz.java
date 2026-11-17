package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.PandoParseConfig;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* renamed from: X.EIz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6597EIz extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6597EIz(DYp dYp) {
        super(0);
        this.$t = 6;
        this.A00 = null;
        this.A01 = dYp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        F0C f0c;
        switch (this.$t) {
            case 0:
                Map map = (Map) ((C7117EgX) this.A00).A01.getValue();
                C7116EgW c7116EgW = (C7116EgW) this.A01;
                LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    C7084Efk c7084Efk = (C7084Efk) entryA0l.getValue();
                    C7114EgU c7114EgU = c7116EgW.A05;
                    C7011EeI c7011EeIA00 = c7114EgU.A00();
                    C7012EeJ c7012EeJ = (C7012EeJ) c7114EgU.A07.getValue();
                    Executor executor = ((C7120Ega) c7116EgW.A04).A02;
                    linkedHashMapA0I.put(key, new C7081Efh(c7084Efk, c7012EeJ, c7116EgW.A02, c7011EeIA00, executor, executor));
                }
                return new C6996Edx(linkedHashMapA0I);
            case 1:
                return AGH.A0E();
            case 2:
                f0c = ((C7117EgX) this.A00).A03;
                break;
            case 3:
                f0c = ((C7117EgX) this.A00).A05;
                break;
            case 4:
                DYp dYp = (DYp) this.A01;
                F0C<PandoGraphQLConsistencyJNI> f0c2 = dYp.A04;
                F0C f0c3 = (F0C) this.A00;
                PandoPrimaryExecution pandoPrimaryExecution = f0c3 != null ? (PandoPrimaryExecution) f0c3.getValue() : null;
                PandoGraphQLConsistencyJNI value = f0c2.getValue();
                C5120DZw c5120DZw = dYp.A00;
                List list = dYp.A01.A00;
                if (list == null) {
                    list = C0881AGi.A00;
                }
                return new PandoGraphQLServiceJNI(pandoPrimaryExecution, value, c5120DZw, 0, true, list, dYp.A02, null, false, dYp.A09, false, false);
            case 5:
                F0C f0c4 = (F0C) this.A00;
                PandoPrimaryExecution pandoPrimaryExecution2 = f0c4 != null ? (PandoPrimaryExecution) f0c4.getValue() : null;
                DYp dYp2 = (DYp) this.A01;
                PandoGraphQLConsistencyJNI value2 = dYp2.A04.getValue();
                PandoParseConfig pandoParseConfig = dYp2.A02;
                C5120DZw c5120DZw2 = dYp2.A00;
                List list2 = dYp2.A01.A00;
                if (list2 == null) {
                    list2 = C0881AGi.A00;
                }
                return new PandoGraphQLServiceJNI(pandoPrimaryExecution2, value2, c5120DZw2, 0, false, list2, pandoParseConfig, null, false, dYp2.A09, false, false);
            case 6:
                F0C f0c5 = (F0C) this.A00;
                PandoPrimaryExecution pandoPrimaryExecution3 = f0c5 != null ? (PandoPrimaryExecution) f0c5.getValue() : null;
                DYp dYp3 = (DYp) this.A01;
                return new PandoGraphQLServiceJNI(pandoPrimaryExecution3, dYp3.A04.getValue(), dYp3.A00, 0, false, null, dYp3.A02, null, false, dYp3.A09, false, false);
            default:
                AssetManager assets = ((Context) this.A00).getAssets();
                C7384Etj.A0U(assets);
                BWN bwn = (BWN) this.A01;
                C7384Etj.A0Y(bwn, 2);
                return new C5119DZv(assets, bwn);
        }
        C7084Efk c7084Efk2 = (C7084Efk) f0c.getValue();
        C7116EgW c7116EgW2 = (C7116EgW) this.A01;
        C7114EgU c7114EgU2 = c7116EgW2.A05;
        C7011EeI c7011EeIA002 = c7114EgU2.A00();
        C7012EeJ c7012EeJ2 = (C7012EeJ) c7114EgU2.A07.getValue();
        Executor executor2 = ((C7120Ega) c7116EgW2.A04).A02;
        return new C7081Efh(c7084Efk2, c7012EeJ2, c7116EgW2.A02, c7011EeIA002, executor2, executor2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6597EIz(DYp dYp, DYp dYp2, F0C<? extends PandoPrimaryExecution> f0c) {
        super(0);
        this.$t = f0c;
        if (4 - f0c != 0) {
            this.A00 = dYp2;
            this.A01 = dYp;
        } else {
            this.A01 = dYp;
            this.A00 = dYp2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6597EIz(Context context, BWN bwn) {
        super(0);
        this.$t = 7;
        this.A00 = context;
        this.A01 = bwn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6597EIz(C7117EgX c7117EgX, C7116EgW c7116EgW, int i) {
        super(0);
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
                this.A00 = c7117EgX;
                this.A01 = c7116EgW;
                break;
            case 1:
            default:
                this.A00 = c7116EgW;
                this.A01 = c7117EgX;
                break;
        }
    }
}
