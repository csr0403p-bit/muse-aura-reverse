package com.facebook.aura.browsertask.data;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C3b6;
import X.C3cG;
import X.C7384Etj;
import X.C8d6;
import X.HxE;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskScreenshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class BrowserTaskStateKt {
    public static final BrowserTaskPresentation selectCurrentBrowserTask(List<BrowserTaskPresentation> list, String str) {
        Object objA0I;
        C7384Etj.A0Y(list, 0);
        if (str != null) {
            Iterator<BrowserTaskPresentation> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    objA0I = null;
                    break;
                }
                objA0I = it.next();
                if (str.equals(((BrowserTaskPresentation) objA0I).browserTaskId)) {
                    break;
                }
            }
        } else {
            objA0I = AbstractC0878AGe.A0I(list);
        }
        return (BrowserTaskPresentation) objA0I;
    }

    public static final boolean canStopBrowserTask(BrowserTaskPresentation browserTaskPresentation) {
        return (browserTaskPresentation == null || browserTaskPresentation.isTombstone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isPlaceholder(BrowserTaskPresentation browserTaskPresentation) {
        String str = null;
        int i = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        return browserTaskPresentation.equals(new BrowserTaskPresentation(browserTaskPresentation.browserTaskId, str, (String) objArr, (String) objArr2, (String) objArr3, i, (Integer) objArr4, (boolean) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Long) objArr5, (Long) objArr6, (String) objArr7, (BrowserTaskScreenshot) objArr8, (boolean) (0 == true ? 1 : 0), (String) objArr9, (String) objArr10, (String) objArr11, (BrowserTaskExecution) objArr12, 262142, (C06H) objArr13));
    }

    public static final BrowserTaskRepositoryState focusBrowserTask(BrowserTaskRepositoryState browserTaskRepositoryState, BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskPresentation next;
        AnonymousClass003.A0u(browserTaskRepositoryState, browserTaskPresentation);
        Iterator<BrowserTaskPresentation> it = browserTaskRepositoryState.activeTasks.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.browserTaskId, browserTaskPresentation.browserTaskId)) {
                break;
            }
        }
        BrowserTaskPresentation browserTaskPresentation2 = next;
        if (browserTaskPresentation2 == null || isPlaceholder(browserTaskPresentation2)) {
            browserTaskPresentation2 = browserTaskPresentation;
        }
        return browserTaskRepositoryState.copy(upsertOrRemove(browserTaskRepositoryState.activeTasks, browserTaskPresentation2), browserTaskPresentation.browserTaskId, null);
    }

    public static final BrowserTaskRepositoryState reduceBrowserTaskUpdate(BrowserTaskRepositoryState browserTaskRepositoryState, BrowserTaskPresentation browserTaskPresentation) {
        AnonymousClass003.A0u(browserTaskRepositoryState, browserTaskPresentation);
        String str = browserTaskRepositoryState.presentedTaskId;
        if (str == null) {
            BrowserTaskPresentation browserTaskPresentation2 = (BrowserTaskPresentation) AbstractC0878AGe.A0I(browserTaskRepositoryState.activeTasks);
            str = browserTaskPresentation2 != null ? browserTaskPresentation2.browserTaskId : null;
        }
        List<BrowserTaskPresentation> listUpsertOrRemove = upsertOrRemove(browserTaskRepositoryState.activeTasks, browserTaskPresentation);
        if (!browserTaskPresentation.isTombstone()) {
            BrowserTaskPresentation browserTaskPresentation3 = browserTaskRepositoryState.terminalTask;
            return browserTaskRepositoryState.copy(listUpsertOrRemove, browserTaskRepositoryState.presentedTaskId, C7384Etj.areEqual(browserTaskPresentation3 != null ? browserTaskPresentation3.browserTaskId : null, browserTaskPresentation.browserTaskId) ? null : browserTaskRepositoryState.terminalTask);
        }
        boolean zAreEqual = C7384Etj.areEqual(browserTaskPresentation.browserTaskId, str);
        String str2 = browserTaskRepositoryState.presentedTaskId;
        if (!zAreEqual) {
            browserTaskPresentation = browserTaskRepositoryState.terminalTask;
        } else if (str2 == null) {
            str2 = browserTaskPresentation.browserTaskId;
        }
        return browserTaskRepositoryState.copy(listUpsertOrRemove, str2, browserTaskPresentation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<BrowserTaskPresentation> selectActiveBrowserTasksFromHistory(C3b6<HxE<Long, BrowserTaskPresentation>> c3b6, Set<String> set) {
        AnonymousClass003.A0u(c3b6, set);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator it = new C8d6(new Comparator() { // from class: com.facebook.aura.browsertask.data.BrowserTaskStateKt$selectActiveBrowserTasksFromHistory$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Number number = (Number) ((HxE) t).first;
                Long lValueOf = Long.valueOf(number != null ? number.longValue() : Long.MIN_VALUE);
                Number number2 = (Number) ((HxE) t2).first;
                return lValueOf.compareTo(Long.valueOf(number2 != null ? number2.longValue() : Long.MIN_VALUE));
            }
        }, c3b6).iterator();
        while (it.hasNext()) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) ((HxE) it.next()).second;
            linkedHashMapA0j.remove(browserTaskPresentation.browserTaskId);
            linkedHashMapA0j.put(browserTaskPresentation.browserTaskId, browserTaskPresentation);
        }
        Collection collectionValues = linkedHashMapA0j.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : collectionValues) {
            BrowserTaskPresentation browserTaskPresentation2 = (BrowserTaskPresentation) obj;
            if (!browserTaskPresentation2.isTombstone() && !set.contains(browserTaskPresentation2.browserTaskId)) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public static final List<BrowserTaskPresentation> upsertOrRemove(List<BrowserTaskPresentation> list, BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation.isTombstone()) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (BrowserTaskPresentation browserTaskPresentation2 : list) {
                AnonymousClass006.A1O(browserTaskPresentation2.browserTaskId, browserTaskPresentation.browserTaskId, browserTaskPresentation2, arrayListA0h);
            }
            return arrayListA0h;
        }
        Iterator<BrowserTaskPresentation> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(it.next().browserTaskId, browserTaskPresentation.browserTaskId)) {
                i++;
            } else if (i >= 0) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i, browserTaskPresentation);
                return arrayList;
            }
        }
        return AbstractC0878AGe.A0Q(browserTaskPresentation, list);
    }
}
