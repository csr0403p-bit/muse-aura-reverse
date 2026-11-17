package X;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.facebook.aura.R;
import java.util.ArrayList;

/* renamed from: X.FgR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8572FgR {
    public final Fragment A02;
    public final C8584Fgj A03;
    public final C8575FgX A04;
    public boolean A01 = false;
    public int A00 = -1;

    private final void A00() {
        Fragment fragment = this.A02;
        if (fragment.mView != null) {
            if (AbstractC8571FgQ.A0L()) {
                StringBuilder sbA0f = C3cG.A0f(fragment, "Saving view state for fragment ");
                sbA0f.append(" with view ");
                AbstractC7607F5u.A1N(C8j3.A14(fragment.mView, sbA0f));
            }
            SparseArray<Parcelable> sparseArrayA0B = BV4.A0B();
            fragment.mView.saveHierarchyState(sparseArrayA0B);
            if (sparseArrayA0B.size() > 0) {
                fragment.mSavedViewState = sparseArrayA0B;
            }
            Bundle bundleA0N = BV6.A0N();
            fragment.mViewLifecycleOwner.A01.A02(bundleA0N);
            if (bundleA0N.isEmpty()) {
                return;
            }
            fragment.mSavedViewRegistryState = bundleA0N;
        }
    }

    public final void A02() {
        View view;
        View view2;
        Fragment fragment = this.A02;
        Fragment fragmentA01 = AbstractC8571FgQ.A01(fragment.mContainer);
        Fragment fragment2 = fragment.mParentFragment;
        if (fragmentA01 != null && !fragmentA01.equals(fragment2)) {
            int i = fragment.mContainerId;
            Hi5 hi5 = AbstractC8519FfS.A00;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, fragmentA01, i);
            AbstractC8519FfS.A02(wrongNestedHierarchyViolation);
            Hi5 hi5A00 = AbstractC8519FfS.A00(fragment);
            AbstractC7611F5y.A0k(hi5A00, wrongNestedHierarchyViolation, EnumC8520FfT.DETECT_WRONG_NESTED_HIERARCHY, fragment, hi5A00.A01);
        }
        C8575FgX c8575FgX = this.A04;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = c8575FgX.A01;
            int iIndexOf = arrayList.indexOf(fragment);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment3 = arrayList.get(iIndexOf);
                        if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment4 = arrayList.get(i2);
                    if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void A03() {
        Fragment fragment = this.A02;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (AbstractC8571FgQ.A0M()) {
                AbstractC7607F5u.A1O(AnonymousClass007.A0a("moveto CREATE_VIEW: ", fragment));
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterOnGetLayoutInflater = fragment.onGetLayoutInflater(bundle2);
            fragment.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
            fragment.performCreateView(layoutInflaterOnGetLayoutInflater, null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.A03.A01(bundle2, fragment.mView, fragment);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x0036, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034f A[Catch: all -> 0x0683, TryCatch #0 {all -> 0x0683, blocks: (B:9:0x001f, B:10:0x0022, B:12:0x0028, B:13:0x002a, B:16:0x0031, B:17:0x0033, B:19:0x0038, B:21:0x003e, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:30:0x0057, B:31:0x005c, B:33:0x0066, B:38:0x0079, B:39:0x0096, B:40:0x00b2, B:42:0x00b8, B:43:0x00bd, B:44:0x00c7, B:46:0x00cd, B:47:0x00d2, B:49:0x00d6, B:50:0x00dc, B:52:0x00e8, B:54:0x00ee, B:55:0x00f3, B:57:0x00f7, B:58:0x00fd, B:60:0x0101, B:62:0x0110, B:179:0x0377, B:64:0x011a, B:66:0x011e, B:68:0x0122, B:70:0x013a, B:71:0x0143, B:73:0x014b, B:75:0x0152, B:77:0x0158, B:78:0x015d, B:80:0x0162, B:81:0x0168, B:103:0x01e5, B:105:0x01ee, B:107:0x01f4, B:108:0x01f9, B:110:0x0208, B:111:0x020b, B:113:0x020f, B:114:0x0216, B:116:0x0220, B:117:0x0223, B:181:0x037e, B:183:0x0386, B:185:0x038f, B:186:0x039a, B:120:0x0241, B:187:0x03a0, B:86:0x0177, B:90:0x017e, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:98:0x01a3, B:139:0x02c5, B:100:0x01cc, B:102:0x01d0, B:99:0x01be, B:123:0x024e, B:125:0x0254, B:126:0x0259, B:128:0x0264, B:130:0x0272, B:131:0x027a, B:132:0x027d, B:133:0x0294, B:134:0x02a5, B:136:0x02a9, B:138:0x02b5, B:140:0x02c6, B:141:0x02c7, B:143:0x02cc, B:145:0x02d2, B:146:0x02d7, B:147:0x02e1, B:149:0x02e7, B:150:0x02ec, B:151:0x02f6, B:153:0x02fc, B:154:0x0301, B:156:0x0305, B:158:0x0309, B:159:0x030c, B:160:0x0326, B:162:0x032c, B:163:0x0331, B:165:0x0347, B:167:0x034f, B:169:0x0355, B:170:0x035a, B:171:0x035f, B:173:0x036d, B:175:0x0371, B:180:0x037b, B:188:0x03a4, B:190:0x03a8, B:192:0x03b6, B:193:0x03bf, B:195:0x03c5, B:196:0x03ca, B:198:0x03cf, B:218:0x0407, B:220:0x040b, B:221:0x0414, B:223:0x041a, B:228:0x0431, B:231:0x0437, B:233:0x0441, B:234:0x044a, B:235:0x044f, B:236:0x0461, B:238:0x0467, B:240:0x046f, B:242:0x047b, B:243:0x0480, B:245:0x0484, B:246:0x048a, B:224:0x0421, B:226:0x0427, B:204:0x03dd, B:206:0x03eb, B:208:0x03ef, B:210:0x03f3, B:212:0x03f7, B:214:0x03fd, B:216:0x0401, B:217:0x0403, B:247:0x048f, B:249:0x0495, B:250:0x04a2, B:252:0x04a6, B:253:0x04b3, B:255:0x04b7, B:257:0x04bb, B:259:0x04c9, B:260:0x04d2, B:261:0x04d9, B:262:0x04dd, B:264:0x04e1, B:266:0x04e5, B:338:0x05cf, B:340:0x05d3, B:342:0x05db, B:344:0x05df, B:346:0x05e5, B:347:0x05f2, B:349:0x05fc, B:350:0x0605, B:352:0x0613, B:353:0x0620, B:354:0x0623, B:356:0x0627, B:358:0x062b, B:360:0x062f, B:362:0x063b, B:364:0x0641, B:365:0x064a, B:374:0x0669, B:376:0x066f, B:377:0x0678, B:366:0x0651, B:368:0x0655, B:370:0x0659, B:372:0x065f, B:373:0x0661, B:267:0x04e9, B:276:0x050e, B:273:0x04ff, B:274:0x0504, B:275:0x0509, B:277:0x0512, B:279:0x0516, B:281:0x051a, B:283:0x0522, B:285:0x0528, B:304:0x0562, B:305:0x0569, B:286:0x052c, B:288:0x0530, B:290:0x0534, B:291:0x0538, B:293:0x053c, B:294:0x0540, B:296:0x0544, B:298:0x0553, B:299:0x0555, B:301:0x055b, B:307:0x0570, B:312:0x057b, B:314:0x057f, B:315:0x0584, B:317:0x0588, B:319:0x058c, B:320:0x0590, B:322:0x0594, B:323:0x0598, B:325:0x059e, B:326:0x05ab, B:328:0x05af, B:329:0x05b4, B:331:0x05b8, B:333:0x05c0, B:334:0x05c5), top: B:383:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: all -> 0x0683, TryCatch #0 {all -> 0x0683, blocks: (B:9:0x001f, B:10:0x0022, B:12:0x0028, B:13:0x002a, B:16:0x0031, B:17:0x0033, B:19:0x0038, B:21:0x003e, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:30:0x0057, B:31:0x005c, B:33:0x0066, B:38:0x0079, B:39:0x0096, B:40:0x00b2, B:42:0x00b8, B:43:0x00bd, B:44:0x00c7, B:46:0x00cd, B:47:0x00d2, B:49:0x00d6, B:50:0x00dc, B:52:0x00e8, B:54:0x00ee, B:55:0x00f3, B:57:0x00f7, B:58:0x00fd, B:60:0x0101, B:62:0x0110, B:179:0x0377, B:64:0x011a, B:66:0x011e, B:68:0x0122, B:70:0x013a, B:71:0x0143, B:73:0x014b, B:75:0x0152, B:77:0x0158, B:78:0x015d, B:80:0x0162, B:81:0x0168, B:103:0x01e5, B:105:0x01ee, B:107:0x01f4, B:108:0x01f9, B:110:0x0208, B:111:0x020b, B:113:0x020f, B:114:0x0216, B:116:0x0220, B:117:0x0223, B:181:0x037e, B:183:0x0386, B:185:0x038f, B:186:0x039a, B:120:0x0241, B:187:0x03a0, B:86:0x0177, B:90:0x017e, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:98:0x01a3, B:139:0x02c5, B:100:0x01cc, B:102:0x01d0, B:99:0x01be, B:123:0x024e, B:125:0x0254, B:126:0x0259, B:128:0x0264, B:130:0x0272, B:131:0x027a, B:132:0x027d, B:133:0x0294, B:134:0x02a5, B:136:0x02a9, B:138:0x02b5, B:140:0x02c6, B:141:0x02c7, B:143:0x02cc, B:145:0x02d2, B:146:0x02d7, B:147:0x02e1, B:149:0x02e7, B:150:0x02ec, B:151:0x02f6, B:153:0x02fc, B:154:0x0301, B:156:0x0305, B:158:0x0309, B:159:0x030c, B:160:0x0326, B:162:0x032c, B:163:0x0331, B:165:0x0347, B:167:0x034f, B:169:0x0355, B:170:0x035a, B:171:0x035f, B:173:0x036d, B:175:0x0371, B:180:0x037b, B:188:0x03a4, B:190:0x03a8, B:192:0x03b6, B:193:0x03bf, B:195:0x03c5, B:196:0x03ca, B:198:0x03cf, B:218:0x0407, B:220:0x040b, B:221:0x0414, B:223:0x041a, B:228:0x0431, B:231:0x0437, B:233:0x0441, B:234:0x044a, B:235:0x044f, B:236:0x0461, B:238:0x0467, B:240:0x046f, B:242:0x047b, B:243:0x0480, B:245:0x0484, B:246:0x048a, B:224:0x0421, B:226:0x0427, B:204:0x03dd, B:206:0x03eb, B:208:0x03ef, B:210:0x03f3, B:212:0x03f7, B:214:0x03fd, B:216:0x0401, B:217:0x0403, B:247:0x048f, B:249:0x0495, B:250:0x04a2, B:252:0x04a6, B:253:0x04b3, B:255:0x04b7, B:257:0x04bb, B:259:0x04c9, B:260:0x04d2, B:261:0x04d9, B:262:0x04dd, B:264:0x04e1, B:266:0x04e5, B:338:0x05cf, B:340:0x05d3, B:342:0x05db, B:344:0x05df, B:346:0x05e5, B:347:0x05f2, B:349:0x05fc, B:350:0x0605, B:352:0x0613, B:353:0x0620, B:354:0x0623, B:356:0x0627, B:358:0x062b, B:360:0x062f, B:362:0x063b, B:364:0x0641, B:365:0x064a, B:374:0x0669, B:376:0x066f, B:377:0x0678, B:366:0x0651, B:368:0x0655, B:370:0x0659, B:372:0x065f, B:373:0x0661, B:267:0x04e9, B:276:0x050e, B:273:0x04ff, B:274:0x0504, B:275:0x0509, B:277:0x0512, B:279:0x0516, B:281:0x051a, B:283:0x0522, B:285:0x0528, B:304:0x0562, B:305:0x0569, B:286:0x052c, B:288:0x0530, B:290:0x0534, B:291:0x0538, B:293:0x053c, B:294:0x0540, B:296:0x0544, B:298:0x0553, B:299:0x0555, B:301:0x055b, B:307:0x0570, B:312:0x057b, B:314:0x057f, B:315:0x0584, B:317:0x0588, B:319:0x058c, B:320:0x0590, B:322:0x0594, B:323:0x0598, B:325:0x059e, B:326:0x05ab, B:328:0x05af, B:329:0x05b4, B:331:0x05b8, B:333:0x05c0, B:334:0x05c5), top: B:383:0x001f }] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8572FgR.A04():void");
    }

    public final void A05(ClassLoader classLoader) {
        Fragment fragment = this.A02;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                fragment.mSavedFragmentState.putBundle("savedInstanceState", BV6.A0N());
            }
            try {
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
                FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
                if (fragmentState != null) {
                    fragment.mTargetWho = fragmentState.A05;
                    fragment.mTargetRequestCode = fragmentState.A03;
                    Boolean bool = fragment.mSavedUserVisibleHint;
                    if (bool != null) {
                        fragment.mUserVisibleHint = bool.booleanValue();
                        fragment.mSavedUserVisibleHint = null;
                    } else {
                        fragment.mUserVisibleHint = fragmentState.A0C;
                    }
                }
                if (fragment.mUserVisibleHint) {
                    return;
                }
                fragment.mDeferStart = true;
            } catch (BadParcelableException e) {
                throw new IllegalStateException(AnonymousClass007.A0a("Failed to restore view hierarchy state for fragment ", fragment), e);
            }
        }
    }

    public C8572FgR(Bundle bundle, Fragment fragment, C8584Fgj c8584Fgj, C8575FgX c8575FgX) {
        this.A03 = c8584Fgj;
        this.A04 = c8575FgX;
        this.A02 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public final Bundle A01() {
        Bundle bundle;
        Bundle bundleA0N = BV6.A0N();
        Fragment fragment = this.A02;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundleA0N.putAll(bundle);
        }
        bundleA0N.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > 0) {
            Bundle bundleA0N2 = BV6.A0N();
            fragment.onSaveInstanceState(bundleA0N2);
            if (!bundleA0N2.isEmpty()) {
                bundleA0N.putBundle("savedInstanceState", bundleA0N2);
            }
            this.A03.A05(bundleA0N2, fragment, false);
            Bundle bundleA0N3 = BV6.A0N();
            fragment.mSavedStateRegistryController.A02(bundleA0N3);
            if (!bundleA0N3.isEmpty()) {
                bundleA0N.putBundle("registryState", bundleA0N3);
            }
            Bundle bundleA0S = fragment.mChildFragmentManager.A0S();
            if (!bundleA0S.isEmpty()) {
                bundleA0N.putBundle("childFragmentManager", bundleA0S);
            }
            if (fragment.mView != null) {
                A00();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundleA0N.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle2 = fragment.mSavedViewRegistryState;
            if (bundle2 != null) {
                bundleA0N.putBundle("viewRegistryState", bundle2);
            }
        }
        Bundle bundle3 = fragment.mArguments;
        if (bundle3 != null) {
            bundleA0N.putBundle("arguments", bundle3);
        }
        return bundleA0N;
    }

    public C8572FgR(Fragment fragment, C8584Fgj c8584Fgj, C8575FgX c8575FgX) {
        this.A03 = c8584Fgj;
        this.A04 = c8575FgX;
        this.A02 = fragment;
    }

    public C8572FgR(Bundle bundle, C8584Fgj c8584Fgj, C8518FfP c8518FfP, C8575FgX c8575FgX, ClassLoader classLoader) throws ClassNotFoundException {
        this.A03 = c8584Fgj;
        this.A04 = c8575FgX;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(c8518FfP.A00.A09.A01, fragmentState.mClassName, null);
        fragmentInstantiate.mWho = fragmentState.mWho;
        fragmentInstantiate.mFromLayout = fragmentState.A07;
        fragmentInstantiate.mInDynamicContainer = fragmentState.A09;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.A01;
        fragmentInstantiate.mContainerId = fragmentState.A00;
        fragmentInstantiate.mTag = fragmentState.A04;
        fragmentInstantiate.mRetainInstance = fragmentState.A0B;
        fragmentInstantiate.mRemoving = fragmentState.A0A;
        fragmentInstantiate.mDetached = fragmentState.A06;
        fragmentInstantiate.mHidden = fragmentState.A08;
        fragmentInstantiate.mMaxState = EnumC10573Huf.values()[fragmentState.A02];
        fragmentInstantiate.mTargetWho = fragmentState.A05;
        fragmentInstantiate.mTargetRequestCode = fragmentState.A03;
        fragmentInstantiate.mUserVisibleHint = fragmentState.A0C;
        this.A02 = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (AbstractC8571FgQ.A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("Instantiated fragment ", fragmentInstantiate));
        }
    }
}
