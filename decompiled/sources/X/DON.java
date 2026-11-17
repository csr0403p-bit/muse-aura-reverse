package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes5.dex */
public abstract class DON<K, V> extends AbstractMap<K, V> {
    public transient Collection<V> A00;
    public transient Set<Map.Entry<K, V>> A01;
    public transient Set<K> A02;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> dos = this.A01;
        if (dos == null) {
            if (this instanceof C5022DOr) {
                dos = new C5021DOq<>((C5022DOr) this);
            } else if (this instanceof DOQ) {
                DOO doo = (DOO) this;
                dos = DNa.A02(doo.A00, doo.A01.entrySet());
            } else {
                dos = this instanceof DOR ? new DOS<>((DOR) this) : new C5017DOm<>((C5016DOk) this);
            }
            this.A01 = dos;
        }
        return dos;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> dOd;
        Set<K> set = this.A02;
        if (set == null) {
            if (this instanceof DOQ) {
                DOQ doq = (DOQ) this;
                dOd = DNa.A02(doq.A00, ((DOO) doq).A01.keySet());
            } else if (this instanceof DOR) {
                dOd = new DOP<>((DOR) this);
            } else if (this instanceof C5019DOo) {
                C5019DOo c5019DOo = (C5019DOo) this;
                if (c5019DOo instanceof C5015DOj) {
                    C5015DOj c5015DOj = (C5015DOj) c5019DOo;
                    dOd = new DOl<>(c5015DOj.A00, (NavigableMap) ((SortedMap) c5015DOj.A00));
                } else {
                    dOd = new C5020DOp<>(c5019DOo.A01, (SortedMap) c5019DOo.A00);
                }
                set = dOd;
                this.A02 = dOd;
            } else {
                dOd = new DOd<>(this);
            }
            set = dOd;
            this.A02 = dOd;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> c4998DMo = this.A00;
        if (c4998DMo == null) {
            if (this instanceof DOO) {
                DOO doo = (DOO) this;
                c4998DMo = new DNZ<>(doo.A00, doo, doo.A01);
            } else {
                c4998DMo = new C4998DMo<>(this);
            }
            this.A00 = c4998DMo;
        }
        return c4998DMo;
    }
}
