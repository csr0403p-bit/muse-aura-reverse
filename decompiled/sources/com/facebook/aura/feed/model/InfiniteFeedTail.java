package com.facebook.aura.feed.model;

import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.repo.FeedUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class InfiniteFeedTail {
    public final SnapshotStateList<FeedUnit> items = new SnapshotStateList();
    public final HashSet<String> ids = C60O.A13();

    /* renamed from: com.facebook.aura.feed.model.InfiniteFeedTail$removeId$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<FeedUnit, Boolean> {
        public final /* synthetic */ String $id;

        @Override // X.G0U
        public final Boolean invoke(FeedUnit feedUnit) {
            C7384Etj.A0Y(feedUnit, 0);
            return C60O.A0h(feedUnit.getId(), this.$id);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$id = str;
        }
    }

    /* renamed from: com.facebook.aura.feed.model.InfiniteFeedTail$removeIds$1, reason: invalid class name and case insensitive filesystem */
    public final class C118811 extends AbstractC7559F3s implements G0U<FeedUnit, Boolean> {
        public final /* synthetic */ Set<String> $removedIds;

        @Override // X.G0U
        public final Boolean invoke(FeedUnit feedUnit) {
            C7384Etj.A0Y(feedUnit, 0);
            return Boolean.valueOf(this.$removedIds.contains(feedUnit.getId()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118811(Set<String> set) {
            super(1);
            this.$removedIds = set;
        }
    }

    public final boolean addIfAbsent(FeedUnit feedUnit) {
        C7384Etj.A0Y(feedUnit, 0);
        if (!this.ids.add(feedUnit.getId())) {
            return false;
        }
        this.items.add(feedUnit);
        return true;
    }

    public final boolean containsId(String str) {
        C7384Etj.A0Y(str, 0);
        return this.ids.contains(str);
    }

    public final int indexOfId(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(C60Q.A0m(it))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void removeId(String str) {
        C7384Etj.A0Y(str, 0);
        this.ids.remove(str);
        AbstractC0882AGj.A0v(this.items, new AnonymousClass1(str));
    }

    public final void removeIds(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        if (set.isEmpty()) {
            return;
        }
        this.ids.removeAll(set);
        AbstractC0882AGj.A0v(this.items, new C118811(set));
    }

    public final void replaceAt(int i, FeedUnit feedUnit) {
        C7384Etj.A0Y(feedUnit, 1);
        Iterator it = this.items.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C7384Etj.areEqual(C60Q.A0m(it), feedUnit.getId())) {
                break;
            } else {
                i2++;
            }
        }
        this.ids.remove(((FeedUnit) this.items.get(i)).getId());
        this.ids.add(feedUnit.getId());
        this.items.set(i, feedUnit);
        if (i2 < 0 || i2 == i) {
            return;
        }
        this.items.remove(i2);
    }

    public final void clear() {
        this.ids.clear();
        this.items.clear();
    }

    public final SnapshotStateList<FeedUnit> getItems() {
        return this.items;
    }
}
