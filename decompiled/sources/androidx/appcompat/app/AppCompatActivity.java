package androidx.appcompat.app;

import X.AbstractC10459Hjh;
import X.AbstractC7607F5u;
import X.AbstractC8276Fb0;
import X.AbstractC8280Fb4;
import X.BV4;
import X.C1685AoO;
import X.C3cG;
import X.C7528Ezc;
import X.C8137FWa;
import X.C8139FWc;
import X.C8243FaJ;
import X.C8251FaW;
import X.C8253FaY;
import X.C8254Faa;
import X.C8256Fac;
import X.C8259Faf;
import X.C8264Fam;
import X.C8270Fas;
import X.C8284Fb8;
import X.C8317Fbj;
import X.C8928Ftk;
import X.C8j3;
import X.EC9;
import X.FGI;
import X.HpS;
import X.InterfaceC8306FbY;
import X.InterfaceC8350FcO;
import X.InterfaceC8351FcP;
import X.InterfaceC8358FcW;
import X.LayoutInflaterFactory2C8250FaT;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class AppCompatActivity extends FragmentActivity implements InterfaceC8351FcP, InterfaceC8358FcW {
    public static final String DELEGATE_TAG = "androidx:appcompat";
    public EC9 mDelegate;
    public Resources mResources;

    private void initDelegate() {
        this.savedStateRegistryController.A00.A03(new C8928Ftk(this, 1), DELEGATE_TAG);
        addOnContextAvailableListener(new C8284Fb8(this));
    }

    public EC9 getDelegate() {
        EC9 ec9 = this.mDelegate;
        if (ec9 != null) {
            return ec9;
        }
        int i = EC9.A00;
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = new LayoutInflaterFactory2C8250FaT(this, null, this, this);
        this.mDelegate = layoutInflaterFactory2C8250FaT;
        return layoutInflaterFactory2C8250FaT;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    public void onCreateSupportNavigateUpTaskStack(HpS hpS) {
        throw BV4.A0a("addParentStack");
    }

    public void onLocalesChanged(C7528Ezc c7528Ezc) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(HpS hpS) {
    }

    public void onSupportActionModeFinished(AbstractC8280Fb4 abstractC8280Fb4) {
    }

    public void onSupportActionModeStarted(AbstractC8280Fb4 abstractC8280Fb4) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public AbstractC8280Fb4 onWindowStartingSupportActionMode(InterfaceC8306FbY interfaceC8306FbY) {
        return null;
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public AppCompatActivity() {
        initDelegate();
    }

    public static Intent A01(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            try {
                String strA00 = AbstractC10459Hjh.A00(activity.getComponentName(), activity);
                parentActivityIntent = null;
                if (strA00 != null) {
                    ComponentName componentName = new ComponentName(activity, strA00);
                    try {
                        return AbstractC10459Hjh.A00(componentName, activity) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("NavUtils", FGI.A0U("getParentActivityIntent: bad parentActivityName '", strA00, "' in manifest"));
                        return null;
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return parentActivityIntent;
    }

    public static Intent A02(ComponentName componentName, Context context) {
        String strA00 = AbstractC10459Hjh.A00(componentName, context);
        if (strA00 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strA00);
        return AbstractC10459Hjh.A00(componentName2, context) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static AbstractC8276Fb0 A03(AppCompatActivity appCompatActivity) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) appCompatActivity.getDelegate();
        LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
        return layoutInflaterFactory2C8250FaT.A0D;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT).addView(view, layoutParams);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        layoutInflaterFactory2C8250FaT.A0R = true;
        int i = layoutInflaterFactory2C8250FaT.A02;
        if (i == -100) {
            i = EC9.A00;
        }
        int iA00 = LayoutInflaterFactory2C8250FaT.A00(context, layoutInflaterFactory2C8250FaT, i);
        if (EC9.A04(context)) {
            EC9.A01(context);
        }
        C7528Ezc c7528EzcA08 = LayoutInflaterFactory2C8250FaT.A08(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C8250FaT.A05(context, null, c7528EzcA08, iA00, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C8270Fas) {
            try {
                ((C8270Fas) context).A01(LayoutInflaterFactory2C8250FaT.A05(context, null, c7528EzcA08, iA00, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C8250FaT.A0o) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configurationA0Z = C8j3.A0Z(context.createConfigurationContext(configuration2));
            Configuration configurationA0Z2 = C8j3.A0Z(context);
            configurationA0Z.uiMode = configurationA0Z2.uiMode;
            if (configurationA0Z.equals(configurationA0Z2)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configurationA0Z.diff(configurationA0Z2) != 0) {
                    float f = configurationA0Z.fontScale;
                    float f2 = configurationA0Z2.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configurationA0Z.mcc;
                    int i3 = configurationA0Z2.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configurationA0Z.mnc;
                    int i5 = configurationA0Z2.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    LocaleList locales = configurationA0Z.getLocales();
                    LocaleList locales2 = configurationA0Z2.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configurationA0Z2.locale;
                    }
                    int i6 = configurationA0Z.touchscreen;
                    int i7 = configurationA0Z2.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configurationA0Z.keyboard;
                    int i9 = configurationA0Z2.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configurationA0Z.keyboardHidden;
                    int i11 = configurationA0Z2.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configurationA0Z.navigation;
                    int i13 = configurationA0Z2.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configurationA0Z.navigationHidden;
                    int i15 = configurationA0Z2.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configurationA0Z.orientation;
                    int i17 = configurationA0Z2.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configurationA0Z.screenLayout & 15;
                    int i19 = configurationA0Z2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configurationA0Z.screenLayout & 192;
                    int i21 = configurationA0Z2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configurationA0Z.screenLayout & 48;
                    int i23 = configurationA0Z2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configurationA0Z.screenLayout & 768;
                    int i25 = configurationA0Z2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configurationA0Z.colorMode & 3;
                    int i27 = configurationA0Z2.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configurationA0Z.colorMode & 12;
                    int i29 = configurationA0Z2.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configurationA0Z.uiMode & 15;
                    int i31 = configurationA0Z2.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configurationA0Z.uiMode & 48;
                    int i33 = configurationA0Z2.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configurationA0Z.screenWidthDp;
                    int i35 = configurationA0Z2.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configurationA0Z.screenHeightDp;
                    int i37 = configurationA0Z2.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configurationA0Z.smallestScreenWidthDp;
                    int i39 = configurationA0Z2.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configurationA0Z.densityDpi;
                    int i41 = configurationA0Z2.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration configurationA05 = LayoutInflaterFactory2C8250FaT.A05(context, configuration, c7528EzcA08, iA00, true);
            C8270Fas c8270Fas = new C8270Fas(context);
            c8270Fas.A00 = R.style._name_removed__res_0x7f130089;
            c8270Fas.A01(configurationA05);
            try {
                if (context.getTheme() != null) {
                    c8270Fas.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context = c8270Fas;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionMenuView actionMenuView;
        C8243FaJ c8243FaJ;
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (getWindow().hasFeature(0)) {
            if (abstractC8276Fb0A03 == null || !(abstractC8276Fb0A03 instanceof C8256Fac) || (actionMenuView = ((C8254Faa) ((C8256Fac) abstractC8276Fb0A03).A06).A09.A0A) == null || (c8243FaJ = actionMenuView.A04) == null || !c8243FaJ.A02()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ActionMenuView actionMenuView;
        C8243FaJ c8243FaJ;
        int keyCode = keyEvent.getKeyCode();
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (keyCode != 82 || abstractC8276Fb0A03 == null || !(abstractC8276Fb0A03 instanceof C8256Fac)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 1 || (actionMenuView = ((C8254Faa) ((C8256Fac) abstractC8276Fb0A03).A06).A09.A0A) == null || (c8243FaJ = actionMenuView.A04) == null) {
            return true;
        }
        c8243FaJ.A04();
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        LayoutInflaterFactory2C8250FaT.A0E(layoutInflaterFactory2C8250FaT);
        return (T) layoutInflaterFactory2C8250FaT.A09.findViewById(i);
    }

    public InterfaceC8350FcO getDrawerToggleDelegate() {
        return new C8317Fbj((LayoutInflaterFactory2C8250FaT) getDelegate());
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        MenuInflater menuInflater = layoutInflaterFactory2C8250FaT.A07;
        if (menuInflater != null) {
            return menuInflater;
        }
        LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
        AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
        C8253FaY c8253FaY = new C8253FaY(abstractC8276Fb0 != null ? abstractC8276Fb0.A02() : layoutInflaterFactory2C8250FaT.A0k);
        layoutInflaterFactory2C8250FaT.A07 = c8253FaY;
        return c8253FaY;
    }

    public AbstractC8276Fb0 getSupportActionBar() {
        return A03(this);
    }

    public Intent getSupportParentActivityIntent() {
        return A01(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().A0K();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        if (layoutInflaterFactory2C8250FaT.A0X && layoutInflaterFactory2C8250FaT.A0d) {
            LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
            AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
            if (abstractC8276Fb0 != null && (abstractC8276Fb0 instanceof C8251FaW)) {
                C8251FaW c8251FaW = (C8251FaW) abstractC8276Fb0;
                c8251FaW.A01.getResources().getBoolean(R.bool._name_removed__res_0x7f050000);
                c8251FaW.A08.setTabContainer(null);
                ((C8254Faa) c8251FaW.A0B).A09.setCollapsible(false);
                c8251FaW.A0A.A05 = false;
            }
        }
        C8139FWc c8139FWcA00 = C8139FWc.A00();
        Context context = layoutInflaterFactory2C8250FaT.A0k;
        synchronized (c8139FWcA00) {
            C8137FWa c8137FWa = c8139FWcA00.A00;
            synchronized (c8137FWa) {
                C1685AoO<WeakReference<Drawable.ConstantState>> c1685AoO = c8137FWa.A04.get(context);
                if (c1685AoO != null) {
                    c1685AoO.A05();
                }
            }
        }
        layoutInflaterFactory2C8250FaT.A04 = new Configuration(C8j3.A0Z(context));
        LayoutInflaterFactory2C8250FaT.A0G(layoutInflaterFactory2C8250FaT, false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().A0M();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (menuItem.getItemId() != 16908332 || abstractC8276Fb0A03 == null) {
            return false;
        }
        if ((((C8254Faa) (abstractC8276Fb0A03 instanceof C8251FaW ? ((C8251FaW) abstractC8276Fb0A03).A0B : ((C8256Fac) abstractC8276Fb0A03).A06)).A01 & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        LayoutInflaterFactory2C8250FaT.A0E((LayoutInflaterFactory2C8250FaT) getDelegate());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (abstractC8276Fb0A03 == null || !(abstractC8276Fb0A03 instanceof C8251FaW)) {
            return;
        }
        ((C8251FaW) abstractC8276Fb0A03).A0J = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        LayoutInflaterFactory2C8250FaT.A0G((LayoutInflaterFactory2C8250FaT) getDelegate(), true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (abstractC8276Fb0A03 == null || !(abstractC8276Fb0A03 instanceof C8251FaW)) {
            return;
        }
        C8251FaW c8251FaW = (C8251FaW) abstractC8276Fb0A03;
        c8251FaW.A0J = false;
        C8264Fam c8264Fam = c8251FaW.A07;
        if (c8264Fam != null) {
            c8264Fam.A00();
        }
    }

    public boolean onSupportNavigateUp() {
        Intent intentA01;
        Intent intentA012 = A01(this);
        if (intentA012 == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentA012)) {
            navigateUpTo(intentA012);
            return true;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        if (((this instanceof InterfaceC8358FcW) && (intentA01 = A01(this)) != null) || (intentA01 = A01(this)) != null) {
            ComponentName component = intentA01.getComponent();
            if (component == null) {
                component = intentA01.resolveActivity(getPackageManager());
            }
            int size = arrayListA0h.size();
            try {
                Intent intentA02 = A02(component, this);
                while (intentA02 != null) {
                    arrayListA0h.add(size, intentA02);
                    intentA02 = A02(intentA02.getComponent(), this);
                }
                arrayListA0h.add(intentA01);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        if (arrayListA0h.isEmpty()) {
            throw C3cG.A0Q("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayListA0h.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().A0N(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionMenuView actionMenuView;
        C8243FaJ c8243FaJ;
        AbstractC8276Fb0 abstractC8276Fb0A03 = A03(this);
        if (getWindow().hasFeature(0)) {
            if (abstractC8276Fb0A03 == null || !(abstractC8276Fb0A03 instanceof C8256Fac) || (actionMenuView = ((C8254Faa) ((C8256Fac) abstractC8276Fb0A03).A06).A09.A0A) == null || (c8243FaJ = actionMenuView.A04) == null || !c8243FaJ.A04()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        LayoutInflater.from(layoutInflaterFactory2C8250FaT.A0k).inflate(i, viewGroupA0f);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        Object obj = layoutInflaterFactory2C8250FaT.A0m;
        if (obj instanceof Activity) {
            LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
            AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
            if (abstractC8276Fb0 instanceof C8251FaW) {
                throw C3cG.A0Q("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C8250FaT.A07 = null;
            if (abstractC8276Fb0 != null && (abstractC8276Fb0 instanceof C8256Fac)) {
                C8256Fac c8256Fac = (C8256Fac) abstractC8276Fb0;
                ((C8254Faa) c8256Fac.A06).A09.removeCallbacks(c8256Fac.A07);
            }
            layoutInflaterFactory2C8250FaT.A0D = null;
            if (toolbar != null) {
                C8256Fac c8256Fac2 = new C8256Fac(layoutInflaterFactory2C8250FaT.A0E, toolbar, ((Activity) obj).getTitle());
                layoutInflaterFactory2C8250FaT.A0D = c8256Fac2;
                layoutInflaterFactory2C8250FaT.A0E.A00 = c8256Fac2.A05;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C8250FaT.A0E.A00 = null;
            }
            layoutInflaterFactory2C8250FaT.A0K();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C8250FaT) getDelegate()).A03 = i;
    }

    public AbstractC8280Fb4 startSupportActionMode(InterfaceC8306FbY interfaceC8306FbY) {
        return getDelegate().A0I(interfaceC8306FbY);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().A0K();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().A0O(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        viewGroupA0f.addView(view, layoutParams);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) getDelegate();
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        viewGroupA0f.addView(view);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }
}
