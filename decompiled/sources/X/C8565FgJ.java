package X;

import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FgJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8565FgJ extends AbstractC8522FfX {
    public final void A08(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A08(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A02(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i < size) {
                transition.addTarget(AbstractC7607F5u.A0d(arrayList2, i));
                i++;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget(AbstractC7607F5u.A0d(arrayList, size2));
            }
        }
    }

    public static boolean A02(Transition transition) {
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds != null && !targetIds.isEmpty()) {
            return true;
        }
        List<String> targetNames = transition.getTargetNames();
        if (targetNames != null && !targetNames.isEmpty()) {
            return true;
        }
        List<Class> targetTypes = transition.getTargetTypes();
        return (targetTypes == null || targetTypes.isEmpty()) ? false : true;
    }
}
