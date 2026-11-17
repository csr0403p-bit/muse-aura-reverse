package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.transition.FragmentTransitionSupport;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ffu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8541Ffu {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final List<C8542Ffv> A04 = C3cG.A0h();
    public final List<C8542Ffv> A05 = C3cG.A0h();

    public final void A09() {
        String strA0v;
        String strA0v2;
        if (AbstractC8571FgQ.A0N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.A03;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        List<C8542Ffv> list = this.A04;
        synchronized (list) {
            A03();
            A07(this, list);
            ArrayList arrayListA0R = AbstractC0878AGe.A0R(this.A05);
            Iterator it = arrayListA0R.iterator();
            while (it.hasNext()) {
                AbstractC7607F5u.A0l(it).A05 = false;
            }
            Iterator it2 = arrayListA0R.iterator();
            while (it2.hasNext()) {
                C8542Ffv c8542FfvA0l = AbstractC7607F5u.A0l(it2);
                if (AbstractC8571FgQ.A0N(2)) {
                    if (zIsAttachedToWindow) {
                        strA0v2 = "";
                    } else {
                        StringBuilder sbA0w = C60O.A0w();
                        sbA0w.append("Container ");
                        sbA0w.append(viewGroup);
                        strA0v2 = AnonymousClass001.A0v(" is not attached to window. ", sbA0w);
                    }
                    StringBuilder sbA0w2 = C60O.A0w();
                    sbA0w2.append("SpecialEffectsController: ");
                    sbA0w2.append(strA0v2);
                    AbstractC7610F5x.A1M(c8542FfvA0l, "Cancelling running operation ", sbA0w2);
                }
                c8542FfvA0l.A03(viewGroup);
            }
            ArrayList arrayListA0t = BV4.A0t(list);
            Iterator it3 = arrayListA0t.iterator();
            while (it3.hasNext()) {
                AbstractC7607F5u.A0l(it3).A05 = false;
            }
            Iterator it4 = arrayListA0t.iterator();
            while (it4.hasNext()) {
                C8542Ffv c8542FfvA0l2 = AbstractC7607F5u.A0l(it4);
                if (AbstractC8571FgQ.A0N(2)) {
                    if (zIsAttachedToWindow) {
                        strA0v = "";
                    } else {
                        StringBuilder sbA0w3 = C60O.A0w();
                        sbA0w3.append("Container ");
                        sbA0w3.append(viewGroup);
                        strA0v = AnonymousClass001.A0v(" is not attached to window. ", sbA0w3);
                    }
                    StringBuilder sbA0w4 = C60O.A0w();
                    sbA0w4.append("SpecialEffectsController: ");
                    sbA0w4.append(strA0v);
                    AbstractC7610F5x.A1M(c8542FfvA0l2, "Cancelling pending operation ", sbA0w4);
                }
                c8542FfvA0l2.A03(viewGroup);
            }
        }
    }

    public final void A0B(C8542Ffv c8542Ffv) {
        C7384Etj.A0Y(c8542Ffv, 0);
        if (c8542Ffv.A02) {
            Integer num = c8542Ffv.A00;
            View viewRequireView = c8542Ffv.A07.requireView();
            C7384Etj.A0U(viewRequireView);
            AbstractC8523FfY.A02(viewRequireView, this.A03, num);
            c8542Ffv.A02 = false;
        }
    }

    public static final C8542Ffv A00(Fragment fragment, AbstractC8541Ffu abstractC8541Ffu) {
        C8542Ffv next;
        Iterator<C8542Ffv> it = abstractC8541Ffu.A04.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8542Ffv c8542Ffv = next;
            if (c8542Ffv.A07.equals(fragment) && !c8542Ffv.A03) {
                break;
            }
        }
        return next;
    }

    public static final C8542Ffv A01(Fragment fragment, AbstractC8541Ffu abstractC8541Ffu) {
        C8542Ffv next;
        Iterator<C8542Ffv> it = abstractC8541Ffu.A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8542Ffv c8542Ffv = next;
            if (c8542Ffv.A07.equals(fragment) && !c8542Ffv.A03) {
                break;
            }
        }
        return next;
    }

    private final void A03() {
        Iterator<C8542Ffv> it = this.A04.iterator();
        while (it.hasNext()) {
            C8542Ffv c8542FfvA0l = AbstractC7607F5u.A0l(it);
            if (c8542FfvA0l.A01 == C79.A01) {
                View viewRequireView = c8542FfvA0l.A07.requireView();
                C7384Etj.A0U(viewRequireView);
                c8542FfvA0l.A05(AbstractC8523FfY.A00(viewRequireView.getVisibility()), C79.A00);
            }
        }
    }

    public static final void A05(C8572FgR c8572FgR, final AbstractC8541Ffu abstractC8541Ffu, Integer num, Integer num2) {
        List<C8542Ffv> list = abstractC8541Ffu.A04;
        synchronized (list) {
            Fragment fragment = c8572FgR.A02;
            C8542Ffv c8542FfvA00 = A00(fragment, abstractC8541Ffu);
            if (c8542FfvA00 != null || ((fragment.mTransitioning || fragment.mRemoving) && (c8542FfvA00 = A01(fragment, abstractC8541Ffu)) != null)) {
                c8542FfvA00.A05(num, num2);
            } else {
                final C8543Ffw c8543Ffw = new C8543Ffw(c8572FgR, num, num2);
                list.add(c8543Ffw);
                Runnable runnable = new Runnable() { // from class: X.Fg1
                    public static final String __redex_internal_original_name = "SpecialEffectsController$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8541Ffu abstractC8541Ffu2 = abstractC8541Ffu;
                        C8543Ffw c8543Ffw2 = c8543Ffw;
                        if (abstractC8541Ffu2.A04.contains(c8543Ffw2)) {
                            Integer num3 = ((C8542Ffv) c8543Ffw2).A00;
                            View view = c8543Ffw2.A07.mView;
                            C7384Etj.A0T(view);
                            AbstractC8523FfY.A02(view, abstractC8541Ffu2.A03, num3);
                        }
                    }
                };
                List<Runnable> list2 = c8543Ffw.A09;
                list2.add(runnable);
                list2.add(new Runnable() { // from class: X.Fg6
                    public static final String __redex_internal_original_name = "SpecialEffectsController$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8541Ffu abstractC8541Ffu2 = abstractC8541Ffu;
                        C8543Ffw c8543Ffw2 = c8543Ffw;
                        abstractC8541Ffu2.A04.remove(c8543Ffw2);
                        abstractC8541Ffu2.A05.remove(c8543Ffw2);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(AbstractC8541Ffu abstractC8541Ffu, List list) throws Resources.NotFoundException {
        Object obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8542Ffv c8542Ffv = (C8542Ffv) list.get(i);
            if (c8542Ffv instanceof C8543Ffw) {
                C8543Ffw c8543Ffw = (C8543Ffw) c8542Ffv;
                if (!c8543Ffw.A06) {
                    c8543Ffw.A06 = true;
                    Integer num = c8543Ffw.A01;
                    if (num == C79.A01) {
                        C8572FgR c8572FgR = c8543Ffw.A00;
                        Fragment fragment = c8572FgR.A02;
                        View viewFindFocus = fragment.mView.findFocus();
                        if (viewFindFocus != null) {
                            fragment.setFocusedView(viewFindFocus);
                            if (AbstractC8571FgQ.A0N(2)) {
                                AbstractC7610F5x.A1M(fragment, " for Fragment ", C3cG.A0f(viewFindFocus, "requestFocus: Saved focused view "));
                            }
                        }
                        View viewRequireView = c8543Ffw.A07.requireView();
                        C7384Etj.A0U(viewRequireView);
                        if (viewRequireView.getParent() == null) {
                            if (AbstractC8571FgQ.A0N(2)) {
                                StringBuilder sbA0f = C3cG.A0f(fragment, "Adding fragment ");
                                sbA0f.append(" view ");
                                sbA0f.append(viewRequireView);
                                AbstractC7609F5w.A1N(sbA0f, " to container in onStart");
                            }
                            c8572FgR.A02();
                            viewRequireView.setAlpha(0.0f);
                        }
                        if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                            if (AbstractC8571FgQ.A0N(2)) {
                                AbstractC7609F5w.A1N(C3cG.A0f(viewRequireView, "Making view "), " INVISIBLE in onStart");
                            }
                            viewRequireView.setVisibility(4);
                        }
                        viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                        if (AbstractC8571FgQ.A0N(2)) {
                            Log.v("FragmentManager", FGI.A0R("Setting view alpha to ", " in onStart", fragment.getPostOnViewCreatedAlpha()));
                        }
                    } else if (num == C79.A0C) {
                        Fragment fragment2 = c8543Ffw.A00.A02;
                        View viewRequireView2 = fragment2.requireView();
                        C7384Etj.A0U(viewRequireView2);
                        if (AbstractC8571FgQ.A0N(2)) {
                            StringBuilder sbA0x = C60O.A0x("Clearing focus ");
                            sbA0x.append(viewRequireView2.findFocus());
                            sbA0x.append(" on view ");
                            sbA0x.append(viewRequireView2);
                            AbstractC7610F5x.A1M(fragment2, " for Fragment ", sbA0x);
                        }
                        viewRequireView2.clearFocus();
                    }
                }
            } else {
                c8542Ffv.A06 = true;
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(AbstractC7607F5u.A0l(it).A0A, arrayListA0h);
        }
        List listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0g(arrayListA0h));
        int size2 = listA0X.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C8552Fg5 c8552Fg5 = (C8552Fg5) listA0X.get(i2);
            ViewGroup viewGroup = abstractC8541Ffu.A03;
            if (!c8552Fg5.A01) {
                if (c8552Fg5 instanceof C8540Fft) {
                    final C8540Fft c8540Fft = (C8540Fft) c8552Fg5;
                    if (viewGroup.isLaidOut()) {
                        if (C8540Fft.A03(c8540Fft) && (obj = c8540Fft.A07) != null && !c8540Fft.A05()) {
                            StringBuilder sbA0f2 = C3cG.A0f(obj, "Ignoring shared elements transition ");
                            sbA0f2.append(" between ");
                            sbA0f2.append(c8540Fft.A05);
                            sbA0f2.append(" and ");
                            sbA0f2.append(c8540Fft.A06);
                            Log.i("FragmentManager", AnonymousClass001.A0v(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.", sbA0f2));
                        }
                        if (c8540Fft.A05() && C8540Fft.A03(c8540Fft)) {
                            final C10543Hqv c10543HqvA0z = C3cG.A0z();
                            HxE hxEA00 = C8540Fft.A00(viewGroup, c8540Fft, c8540Fft.A06, c8540Fft.A05);
                            ArrayList arrayList = (ArrayList) hxEA00.first;
                            Object obj2 = hxEA00.second;
                            List<C8544Ffx> list2 = c8540Fft.A08;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                            Iterator<C8544Ffx> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayListA0i.add(AbstractC8538Ffr.A00(it2));
                            }
                            Iterator it3 = arrayListA0i.iterator();
                            while (it3.hasNext()) {
                                final C8542Ffv c8542FfvA0l = AbstractC7607F5u.A0l(it3);
                                c8540Fft.A04.A03(c8540Fft.A03, obj2, new Runnable() { // from class: X.FgC
                                    public static final String __redex_internal_original_name = "DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Function0 function0 = (Function0) c10543HqvA0z.element;
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                    }
                                }, new Runnable() { // from class: X.Fg2
                                    public static final String __redex_internal_original_name = "DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C8542Ffv c8542Ffv2 = c8542FfvA0l;
                                        C8540Fft c8540Fft2 = c8540Fft;
                                        if (AbstractC8571FgQ.A0L()) {
                                            AbstractC7610F5x.A1O(C3cG.A0f(c8542Ffv2, "Transition for operation "), " has completed");
                                        }
                                        c8542Ffv2.A04(c8540Fft2);
                                    }
                                });
                            }
                            C8540Fft.A02(viewGroup, c8540Fft, arrayList, new C8187FYe(obj2, viewGroup, c10543HqvA0z, c8540Fft, 0));
                        }
                    } else {
                        Iterator<C8544Ffx> it4 = c8540Fft.A08.iterator();
                        while (it4.hasNext()) {
                            C8542Ffv c8542FfvA00 = AbstractC8538Ffr.A00(it4);
                            if (AbstractC8571FgQ.A0L()) {
                                AbstractC7610F5x.A1M(c8542FfvA00, " has not been laid out. Skipping onStart for operation ", C3cG.A0f(viewGroup, "SpecialEffectsController: Container "));
                            }
                        }
                    }
                } else if (c8552Fg5 instanceof C8535Ffo) {
                    C8535Ffo c8535Ffo = (C8535Ffo) c8552Fg5;
                    C8533Ffm c8533Ffm = c8535Ffo.A01;
                    if (!c8533Ffm.A02()) {
                        C8450FeE c8450FeEA03 = c8533Ffm.A03(AbstractC7608F5v.A0E(viewGroup));
                        c8535Ffo.A00 = c8450FeEA03 != null ? c8450FeEA03.A00 : null;
                        C8542Ffv c8542Ffv2 = ((AbstractC8538Ffr) c8533Ffm).A00;
                        Fragment fragment3 = c8542Ffv2.A07;
                        boolean zA1Z = AnonymousClass002.A1Z(c8542Ffv2.A00, C79.A0C);
                        View view = fragment3.mView;
                        viewGroup.startViewTransition(view);
                        AnimatorSet animatorSet = c8535Ffo.A00;
                        if (animatorSet != null) {
                            animatorSet.addListener(new C8536Ffp(view, viewGroup, c8535Ffo, c8542Ffv2, zA1Z));
                        }
                        AnimatorSet animatorSet2 = c8535Ffo.A00;
                        if (animatorSet2 != null) {
                            animatorSet2.setTarget(view);
                        }
                    }
                }
            }
            c8552Fg5.A01 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029b A[Catch: all -> 0x058e, TryCatch #0 {, blocks: (B:10:0x001a, B:11:0x0027, B:13:0x002e, B:15:0x0038, B:17:0x003e, B:19:0x0043, B:20:0x0047, B:22:0x004f, B:24:0x0057, B:26:0x005d, B:27:0x0066, B:28:0x0069, B:30:0x006f, B:31:0x0073, B:33:0x0079, B:34:0x0082, B:35:0x0086, B:37:0x008c, B:39:0x0099, B:41:0x00a5, B:42:0x00ac, B:44:0x00b9, B:45:0x00be, B:46:0x00c2, B:48:0x00c9, B:50:0x00df, B:52:0x00e3, B:53:0x00ed, B:55:0x00f3, B:57:0x0109, B:62:0x0111, B:64:0x0119, B:65:0x0124, B:66:0x0138, B:68:0x013e, B:69:0x0159, B:70:0x015d, B:72:0x0163, B:79:0x017b, B:80:0x018e, B:81:0x0196, B:83:0x019c, B:85:0x01a9, B:86:0x01ad, B:87:0x01b5, B:89:0x01bb, B:91:0x01c8, B:92:0x01ce, B:93:0x01d4, B:95:0x01da, B:100:0x01eb, B:101:0x0208, B:103:0x020b, B:104:0x0230, B:106:0x0236, B:110:0x0244, B:112:0x0248, B:120:0x0269, B:121:0x0273, B:124:0x029b, B:126:0x02a9, B:127:0x02b2, B:128:0x02b5, B:131:0x02c5, B:132:0x02db, B:134:0x02e1, B:135:0x02ea, B:137:0x02f2, B:138:0x0300, B:139:0x0309, B:141:0x030f, B:142:0x031b, B:143:0x034d, B:145:0x0353, B:147:0x035d, B:148:0x0361, B:150:0x0392, B:118:0x025c, B:113:0x024f, B:152:0x03bc, B:154:0x03c2, B:160:0x03e4, B:161:0x03e8, B:163:0x03ee, B:166:0x03f9, B:167:0x0418, B:169:0x041e, B:156:0x03c8, B:157:0x03d4, B:159:0x03da, B:170:0x0428, B:171:0x0431, B:173:0x0437, B:175:0x044e, B:177:0x0452, B:178:0x0456, B:180:0x0460, B:182:0x0466, B:183:0x0472, B:185:0x0478, B:186:0x047a, B:187:0x0486, B:188:0x048a, B:190:0x0490, B:192:0x049e, B:194:0x04a4, B:195:0x04aa, B:197:0x04b0, B:199:0x04b6, B:200:0x04bd, B:201:0x04c8, B:203:0x04cd, B:205:0x04d3, B:207:0x04df, B:209:0x04e3, B:212:0x04ea, B:213:0x04ee, B:215:0x04f4, B:219:0x0504, B:220:0x050c, B:222:0x0512, B:223:0x051c, B:226:0x0524, B:227:0x0529, B:229:0x052f, B:236:0x0541, B:238:0x0549, B:245:0x0579, B:246:0x057f, B:248:0x0587, B:242:0x0563, B:244:0x056d), top: B:254:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c5 A[Catch: all -> 0x058e, LOOP:11: B:129:0x02c1->B:131:0x02c5, LOOP_END, TryCatch #0 {, blocks: (B:10:0x001a, B:11:0x0027, B:13:0x002e, B:15:0x0038, B:17:0x003e, B:19:0x0043, B:20:0x0047, B:22:0x004f, B:24:0x0057, B:26:0x005d, B:27:0x0066, B:28:0x0069, B:30:0x006f, B:31:0x0073, B:33:0x0079, B:34:0x0082, B:35:0x0086, B:37:0x008c, B:39:0x0099, B:41:0x00a5, B:42:0x00ac, B:44:0x00b9, B:45:0x00be, B:46:0x00c2, B:48:0x00c9, B:50:0x00df, B:52:0x00e3, B:53:0x00ed, B:55:0x00f3, B:57:0x0109, B:62:0x0111, B:64:0x0119, B:65:0x0124, B:66:0x0138, B:68:0x013e, B:69:0x0159, B:70:0x015d, B:72:0x0163, B:79:0x017b, B:80:0x018e, B:81:0x0196, B:83:0x019c, B:85:0x01a9, B:86:0x01ad, B:87:0x01b5, B:89:0x01bb, B:91:0x01c8, B:92:0x01ce, B:93:0x01d4, B:95:0x01da, B:100:0x01eb, B:101:0x0208, B:103:0x020b, B:104:0x0230, B:106:0x0236, B:110:0x0244, B:112:0x0248, B:120:0x0269, B:121:0x0273, B:124:0x029b, B:126:0x02a9, B:127:0x02b2, B:128:0x02b5, B:131:0x02c5, B:132:0x02db, B:134:0x02e1, B:135:0x02ea, B:137:0x02f2, B:138:0x0300, B:139:0x0309, B:141:0x030f, B:142:0x031b, B:143:0x034d, B:145:0x0353, B:147:0x035d, B:148:0x0361, B:150:0x0392, B:118:0x025c, B:113:0x024f, B:152:0x03bc, B:154:0x03c2, B:160:0x03e4, B:161:0x03e8, B:163:0x03ee, B:166:0x03f9, B:167:0x0418, B:169:0x041e, B:156:0x03c8, B:157:0x03d4, B:159:0x03da, B:170:0x0428, B:171:0x0431, B:173:0x0437, B:175:0x044e, B:177:0x0452, B:178:0x0456, B:180:0x0460, B:182:0x0466, B:183:0x0472, B:185:0x0478, B:186:0x047a, B:187:0x0486, B:188:0x048a, B:190:0x0490, B:192:0x049e, B:194:0x04a4, B:195:0x04aa, B:197:0x04b0, B:199:0x04b6, B:200:0x04bd, B:201:0x04c8, B:203:0x04cd, B:205:0x04d3, B:207:0x04df, B:209:0x04e3, B:212:0x04ea, B:213:0x04ee, B:215:0x04f4, B:219:0x0504, B:220:0x050c, B:222:0x0512, B:223:0x051c, B:226:0x0524, B:227:0x0529, B:229:0x052f, B:236:0x0541, B:238:0x0549, B:245:0x0579, B:246:0x057f, B:248:0x0587, B:242:0x0563, B:244:0x056d), top: B:254:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e1 A[Catch: all -> 0x058e, TryCatch #0 {, blocks: (B:10:0x001a, B:11:0x0027, B:13:0x002e, B:15:0x0038, B:17:0x003e, B:19:0x0043, B:20:0x0047, B:22:0x004f, B:24:0x0057, B:26:0x005d, B:27:0x0066, B:28:0x0069, B:30:0x006f, B:31:0x0073, B:33:0x0079, B:34:0x0082, B:35:0x0086, B:37:0x008c, B:39:0x0099, B:41:0x00a5, B:42:0x00ac, B:44:0x00b9, B:45:0x00be, B:46:0x00c2, B:48:0x00c9, B:50:0x00df, B:52:0x00e3, B:53:0x00ed, B:55:0x00f3, B:57:0x0109, B:62:0x0111, B:64:0x0119, B:65:0x0124, B:66:0x0138, B:68:0x013e, B:69:0x0159, B:70:0x015d, B:72:0x0163, B:79:0x017b, B:80:0x018e, B:81:0x0196, B:83:0x019c, B:85:0x01a9, B:86:0x01ad, B:87:0x01b5, B:89:0x01bb, B:91:0x01c8, B:92:0x01ce, B:93:0x01d4, B:95:0x01da, B:100:0x01eb, B:101:0x0208, B:103:0x020b, B:104:0x0230, B:106:0x0236, B:110:0x0244, B:112:0x0248, B:120:0x0269, B:121:0x0273, B:124:0x029b, B:126:0x02a9, B:127:0x02b2, B:128:0x02b5, B:131:0x02c5, B:132:0x02db, B:134:0x02e1, B:135:0x02ea, B:137:0x02f2, B:138:0x0300, B:139:0x0309, B:141:0x030f, B:142:0x031b, B:143:0x034d, B:145:0x0353, B:147:0x035d, B:148:0x0361, B:150:0x0392, B:118:0x025c, B:113:0x024f, B:152:0x03bc, B:154:0x03c2, B:160:0x03e4, B:161:0x03e8, B:163:0x03ee, B:166:0x03f9, B:167:0x0418, B:169:0x041e, B:156:0x03c8, B:157:0x03d4, B:159:0x03da, B:170:0x0428, B:171:0x0431, B:173:0x0437, B:175:0x044e, B:177:0x0452, B:178:0x0456, B:180:0x0460, B:182:0x0466, B:183:0x0472, B:185:0x0478, B:186:0x047a, B:187:0x0486, B:188:0x048a, B:190:0x0490, B:192:0x049e, B:194:0x04a4, B:195:0x04aa, B:197:0x04b0, B:199:0x04b6, B:200:0x04bd, B:201:0x04c8, B:203:0x04cd, B:205:0x04d3, B:207:0x04df, B:209:0x04e3, B:212:0x04ea, B:213:0x04ee, B:215:0x04f4, B:219:0x0504, B:220:0x050c, B:222:0x0512, B:223:0x051c, B:226:0x0524, B:227:0x0529, B:229:0x052f, B:236:0x0541, B:238:0x0549, B:245:0x0579, B:246:0x057f, B:248:0x0587, B:242:0x0563, B:244:0x056d), top: B:254:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0353 A[Catch: all -> 0x058e, TryCatch #0 {, blocks: (B:10:0x001a, B:11:0x0027, B:13:0x002e, B:15:0x0038, B:17:0x003e, B:19:0x0043, B:20:0x0047, B:22:0x004f, B:24:0x0057, B:26:0x005d, B:27:0x0066, B:28:0x0069, B:30:0x006f, B:31:0x0073, B:33:0x0079, B:34:0x0082, B:35:0x0086, B:37:0x008c, B:39:0x0099, B:41:0x00a5, B:42:0x00ac, B:44:0x00b9, B:45:0x00be, B:46:0x00c2, B:48:0x00c9, B:50:0x00df, B:52:0x00e3, B:53:0x00ed, B:55:0x00f3, B:57:0x0109, B:62:0x0111, B:64:0x0119, B:65:0x0124, B:66:0x0138, B:68:0x013e, B:69:0x0159, B:70:0x015d, B:72:0x0163, B:79:0x017b, B:80:0x018e, B:81:0x0196, B:83:0x019c, B:85:0x01a9, B:86:0x01ad, B:87:0x01b5, B:89:0x01bb, B:91:0x01c8, B:92:0x01ce, B:93:0x01d4, B:95:0x01da, B:100:0x01eb, B:101:0x0208, B:103:0x020b, B:104:0x0230, B:106:0x0236, B:110:0x0244, B:112:0x0248, B:120:0x0269, B:121:0x0273, B:124:0x029b, B:126:0x02a9, B:127:0x02b2, B:128:0x02b5, B:131:0x02c5, B:132:0x02db, B:134:0x02e1, B:135:0x02ea, B:137:0x02f2, B:138:0x0300, B:139:0x0309, B:141:0x030f, B:142:0x031b, B:143:0x034d, B:145:0x0353, B:147:0x035d, B:148:0x0361, B:150:0x0392, B:118:0x025c, B:113:0x024f, B:152:0x03bc, B:154:0x03c2, B:160:0x03e4, B:161:0x03e8, B:163:0x03ee, B:166:0x03f9, B:167:0x0418, B:169:0x041e, B:156:0x03c8, B:157:0x03d4, B:159:0x03da, B:170:0x0428, B:171:0x0431, B:173:0x0437, B:175:0x044e, B:177:0x0452, B:178:0x0456, B:180:0x0460, B:182:0x0466, B:183:0x0472, B:185:0x0478, B:186:0x047a, B:187:0x0486, B:188:0x048a, B:190:0x0490, B:192:0x049e, B:194:0x04a4, B:195:0x04aa, B:197:0x04b0, B:199:0x04b6, B:200:0x04bd, B:201:0x04c8, B:203:0x04cd, B:205:0x04d3, B:207:0x04df, B:209:0x04e3, B:212:0x04ea, B:213:0x04ee, B:215:0x04f4, B:219:0x0504, B:220:0x050c, B:222:0x0512, B:223:0x051c, B:226:0x0524, B:227:0x0529, B:229:0x052f, B:236:0x0541, B:238:0x0549, B:245:0x0579, B:246:0x057f, B:248:0x0587, B:242:0x0563, B:244:0x056d), top: B:254:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041e A[Catch: all -> 0x058e, LOOP:16: B:167:0x0418->B:169:0x041e, LOOP_END, TryCatch #0 {, blocks: (B:10:0x001a, B:11:0x0027, B:13:0x002e, B:15:0x0038, B:17:0x003e, B:19:0x0043, B:20:0x0047, B:22:0x004f, B:24:0x0057, B:26:0x005d, B:27:0x0066, B:28:0x0069, B:30:0x006f, B:31:0x0073, B:33:0x0079, B:34:0x0082, B:35:0x0086, B:37:0x008c, B:39:0x0099, B:41:0x00a5, B:42:0x00ac, B:44:0x00b9, B:45:0x00be, B:46:0x00c2, B:48:0x00c9, B:50:0x00df, B:52:0x00e3, B:53:0x00ed, B:55:0x00f3, B:57:0x0109, B:62:0x0111, B:64:0x0119, B:65:0x0124, B:66:0x0138, B:68:0x013e, B:69:0x0159, B:70:0x015d, B:72:0x0163, B:79:0x017b, B:80:0x018e, B:81:0x0196, B:83:0x019c, B:85:0x01a9, B:86:0x01ad, B:87:0x01b5, B:89:0x01bb, B:91:0x01c8, B:92:0x01ce, B:93:0x01d4, B:95:0x01da, B:100:0x01eb, B:101:0x0208, B:103:0x020b, B:104:0x0230, B:106:0x0236, B:110:0x0244, B:112:0x0248, B:120:0x0269, B:121:0x0273, B:124:0x029b, B:126:0x02a9, B:127:0x02b2, B:128:0x02b5, B:131:0x02c5, B:132:0x02db, B:134:0x02e1, B:135:0x02ea, B:137:0x02f2, B:138:0x0300, B:139:0x0309, B:141:0x030f, B:142:0x031b, B:143:0x034d, B:145:0x0353, B:147:0x035d, B:148:0x0361, B:150:0x0392, B:118:0x025c, B:113:0x024f, B:152:0x03bc, B:154:0x03c2, B:160:0x03e4, B:161:0x03e8, B:163:0x03ee, B:166:0x03f9, B:167:0x0418, B:169:0x041e, B:156:0x03c8, B:157:0x03d4, B:159:0x03da, B:170:0x0428, B:171:0x0431, B:173:0x0437, B:175:0x044e, B:177:0x0452, B:178:0x0456, B:180:0x0460, B:182:0x0466, B:183:0x0472, B:185:0x0478, B:186:0x047a, B:187:0x0486, B:188:0x048a, B:190:0x0490, B:192:0x049e, B:194:0x04a4, B:195:0x04aa, B:197:0x04b0, B:199:0x04b6, B:200:0x04bd, B:201:0x04c8, B:203:0x04cd, B:205:0x04d3, B:207:0x04df, B:209:0x04e3, B:212:0x04ea, B:213:0x04ee, B:215:0x04f4, B:219:0x0504, B:220:0x050c, B:222:0x0512, B:223:0x051c, B:226:0x0524, B:227:0x0529, B:229:0x052f, B:236:0x0541, B:238:0x0549, B:245:0x0579, B:246:0x057f, B:248:0x0587, B:242:0x0563, B:244:0x056d), top: B:254:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0361 A[EDGE_INSN: B:311:0x0361->B:148:0x0361 BREAK  A[LOOP:14: B:143:0x034d->B:313:0x034d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8541Ffu.A08():void");
    }

    public final void A0A() {
        C8542Ffv c8542FfvPrevious;
        List<C8542Ffv> list = this.A04;
        synchronized (list) {
            A03();
            ListIterator<C8542Ffv> listIterator = list.listIterator(list.size());
            while (true) {
                c8542FfvPrevious = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                c8542FfvPrevious = listIterator.previous();
                C8542Ffv c8542Ffv = c8542FfvPrevious;
                View view = c8542Ffv.A07.mView;
                C7384Etj.A0T(view);
                Integer numA01 = AbstractC8523FfY.A01(view);
                Integer num = c8542Ffv.A00;
                Integer num2 = C79.A01;
                if (num == num2 && numA01 != num2) {
                    break;
                }
            }
            C8542Ffv c8542Ffv2 = c8542FfvPrevious;
            this.A00 = c8542Ffv2 != null ? c8542Ffv2.A07.isPostponed() : false;
        }
    }

    public AbstractC8541Ffu(ViewGroup viewGroup) {
        this.A03 = viewGroup;
    }

    public static final AbstractC8541Ffu A02(ViewGroup viewGroup, AbstractC8571FgQ abstractC8571FgQ) {
        AnonymousClass003.A0u(viewGroup, abstractC8571FgQ);
        C7384Etj.A0U(abstractC8571FgQ.A0Y());
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AbstractC8541Ffu) {
            return (AbstractC8541Ffu) tag;
        }
        C8560FgD c8560FgD = new C8560FgD(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c8560FgD);
        return c8560FgD;
    }

    public static final void A04(View view, C8560FgD c8560FgD, Map map) {
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A04(childAt, c8560FgD, map);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(AbstractC8541Ffu abstractC8541Ffu, List list) throws Resources.NotFoundException {
        StringBuilder sbA0f;
        C8542Ffv c8542Ffv;
        StringBuilder sbA0f2;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(AbstractC7607F5u.A0l(it).A0A, arrayListA0h);
        }
        List listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0g(arrayListA0h));
        int size = listA0X.size();
        for (int i = 0; i < size; i++) {
            C8552Fg5 c8552Fg5 = (C8552Fg5) listA0X.get(i);
            ViewGroup viewGroup = abstractC8541Ffu.A03;
            if (c8552Fg5 instanceof C8540Fft) {
                final C8540Fft c8540Fft = (C8540Fft) c8552Fg5;
                if (!viewGroup.isLaidOut() || c8540Fft.A01) {
                    Iterator<C8544Ffx> it2 = c8540Fft.A08.iterator();
                    while (it2.hasNext()) {
                        C8542Ffv c8542FfvA00 = AbstractC8538Ffr.A00(it2);
                        if (AbstractC8571FgQ.A0N(2)) {
                            if (c8540Fft.A01) {
                                sbA0f = C60O.A0x("SpecialEffectsController: TransitionSeekController was not created. Completing operation ");
                            } else {
                                sbA0f = C3cG.A0f(viewGroup, "SpecialEffectsController: Container ");
                                sbA0f.append(" has not been laid out. Completing operation ");
                            }
                            Log.v("FragmentManager", C8j3.A14(c8542FfvA00, sbA0f));
                        }
                        c8542FfvA00.A04(c8540Fft);
                    }
                    c8540Fft.A01 = false;
                } else {
                    Object obj = c8540Fft.A00;
                    if (obj != null) {
                        if (c8540Fft.A04 instanceof FragmentTransitionSupport) {
                            ((InterfaceC8449FeD) obj).A4I();
                        }
                        if (AbstractC8571FgQ.A0N(2)) {
                            sbA0f2 = C60O.A0x("Ending execution of operations from ");
                            sbA0f2.append(c8540Fft.A05);
                            sbA0f2.append(" to ");
                            c8542Ffv = c8540Fft.A06;
                            Log.v("FragmentManager", C8j3.A14(c8542Ffv, sbA0f2));
                        }
                    } else {
                        c8542Ffv = c8540Fft.A06;
                        C8542Ffv c8542Ffv2 = c8540Fft.A05;
                        HxE hxEA00 = C8540Fft.A00(viewGroup, c8540Fft, c8542Ffv, c8542Ffv2);
                        ArrayList arrayList = (ArrayList) hxEA00.first;
                        Object obj2 = hxEA00.second;
                        List<C8544Ffx> list2 = c8540Fft.A08;
                        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                        Iterator<C8544Ffx> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayListA0i.add(AbstractC8538Ffr.A00(it3));
                        }
                        Iterator it4 = arrayListA0i.iterator();
                        while (it4.hasNext()) {
                            final C8542Ffv c8542FfvA0l = AbstractC7607F5u.A0l(it4);
                            AbstractC8522FfX abstractC8522FfX = c8540Fft.A04;
                            C8439Fe3 c8439Fe3 = c8540Fft.A03;
                            Runnable runnable = new Runnable() { // from class: X.Fg3
                                public static final String __redex_internal_original_name = "DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8542Ffv c8542Ffv3 = c8542FfvA0l;
                                    C8540Fft c8540Fft2 = c8540Fft;
                                    if (AbstractC8571FgQ.A0L()) {
                                        AbstractC7610F5x.A1O(C3cG.A0f(c8542Ffv3, "Transition for operation "), " has completed");
                                    }
                                    c8542Ffv3.A04(c8540Fft2);
                                }
                            };
                            if (abstractC8522FfX instanceof FragmentTransitionSupport) {
                                abstractC8522FfX.A03(c8439Fe3, obj2, null, runnable);
                            } else {
                                ((Transition) obj2).addListener(new C8568FgM((C8565FgJ) abstractC8522FfX, runnable));
                            }
                        }
                        C8540Fft.A02(viewGroup, c8540Fft, arrayList, new C8188FYf(viewGroup, c8540Fft, obj2, 1));
                        if (AbstractC8571FgQ.A0N(2)) {
                            sbA0f2 = C3cG.A0f(c8542Ffv2, "Completed executing operations from ");
                            sbA0f2.append(" to ");
                            Log.v("FragmentManager", C8j3.A14(c8542Ffv, sbA0f2));
                        }
                    }
                }
            } else if (c8552Fg5 instanceof C8535Ffo) {
                C8535Ffo c8535Ffo = (C8535Ffo) c8552Fg5;
                C8542Ffv c8542Ffv3 = ((AbstractC8538Ffr) c8535Ffo.A01).A00;
                AnimatorSet animatorSet = c8535Ffo.A00;
                if (animatorSet == null) {
                    c8542Ffv3.A04(c8535Ffo);
                } else {
                    animatorSet.start();
                    if (AbstractC8571FgQ.A0L()) {
                        AbstractC7610F5x.A1O(C3cG.A0f(c8542Ffv3, "Animator from operation "), " has started.");
                    }
                }
            } else if (c8552Fg5 instanceof C8534Ffn) {
                C8534Ffn c8534Ffn = (C8534Ffn) c8552Fg5;
                C8533Ffm c8533Ffm = c8534Ffn.A00;
                if (c8533Ffm.A02()) {
                    ((AbstractC8538Ffr) c8533Ffm).A00.A04(c8534Ffn);
                } else {
                    Context context = viewGroup.getContext();
                    C8542Ffv c8542Ffv4 = ((AbstractC8538Ffr) c8533Ffm).A00;
                    View view = c8542Ffv4.A07.mView;
                    C7384Etj.A0U(context);
                    C8450FeE c8450FeEA03 = c8533Ffm.A03(context);
                    if (c8450FeEA03 == null) {
                        throw C3cG.A0Q("Required value was null.");
                    }
                    Animation animation = c8450FeEA03.A01;
                    if (animation == null) {
                        throw C3cG.A0Q("Required value was null.");
                    }
                    if (c8542Ffv4.A00 != C79.A00) {
                        view.startAnimation(animation);
                        ((AbstractC8538Ffr) c8533Ffm).A00.A04(c8534Ffn);
                    } else {
                        viewGroup.startViewTransition(view);
                        RunnableC8442Fe6 runnableC8442Fe6 = new RunnableC8442Fe6(view, viewGroup, animation);
                        runnableC8442Fe6.setAnimationListener(new AnimationAnimationListenerC8537Ffq(view, viewGroup, c8534Ffn, c8542Ffv4));
                        view.startAnimation(runnableC8442Fe6);
                        if (AbstractC8571FgQ.A0L()) {
                            AbstractC7610F5x.A1O(C3cG.A0f(c8542Ffv4, "Animation from operation "), " has started.");
                        }
                    }
                }
            } else {
                continue;
            }
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            abstractC8541Ffu.A0B((C8542Ffv) list.get(i2));
        }
        List listA0X2 = AbstractC0878AGe.A0X(list);
        int size3 = listA0X2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C8542Ffv c8542Ffv5 = (C8542Ffv) listA0X2.get(i3);
            if (c8542Ffv5.A0A.isEmpty()) {
                c8542Ffv5.A02();
            }
        }
    }
}
