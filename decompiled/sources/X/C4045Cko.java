package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import com.facebook.analytics2.logger.interfaces.DefaultHandlerThreadFactory;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.aura.analytics.ffdb.AuraFFDBProvider;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.File;

/* renamed from: X.Cko, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4045Cko {
    public String A00;
    public final int A01;
    public final InterfaceC4014Cju A02;
    public final File A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C4045Cko(Bundle bundle) throws IllegalRemoteArgumentException {
        Bundle bundle2 = new C4059Cl2(bundle).A00;
        String string = bundle2.getString("uploader_class");
        if (string == null) {
            throw new IllegalRemoteArgumentException("uploader_class is null or empty");
        }
        String string2 = bundle2.getString("flexible_sampling_updater");
        string2 = string2 == null ? null : string2;
        String string3 = bundle2.getString("acs_provider");
        string3 = string3 == null ? null : string3;
        String string4 = bundle2.getString("privacy_policy");
        string4 = string4 == null ? null : string4;
        String string5 = bundle2.getString("thread_handler_factory");
        string5 = string5 == null ? null : string5;
        String string6 = bundle2.getString("upload_job_instrumentation");
        string6 = string6 == null ? null : string6;
        String string7 = bundle2.getString("priority_dir");
        if (string7 == null) {
            throw new IllegalRemoteArgumentException("priority_dir is null or empty");
        }
        int i = bundle2.getInt("network_priority", 0);
        String string8 = bundle2.getString("marauder_tier");
        if (string8 == null) {
            throw new IllegalRemoteArgumentException("marauder_tier is null or empty");
        }
        int i2 = bundle2.getInt("multi_batch_payload_size", 20000);
        bundle2.getString(AuraFFDBProvider.FFDB_TOKEN_PREF_KEY);
        String string9 = bundle2.getString("ffdb_provider");
        string9 = string9 == null ? null : string9;
        this.A0C = string;
        this.A09 = string2;
        this.A08 = string4;
        this.A0A = string5;
        this.A0B = string6;
        this.A03 = BV4.A0G(string7);
        this.A04 = C79.A00(2)[i];
        this.A07 = string8;
        this.A01 = i2;
        this.A0D = AnonymousClass002.A1Q(bundle2.getInt("non_sticky_handling", 0), 1);
        this.A0E = bundle2.getInt("use_fifo_uploads", 0) == 1;
        String string10 = bundle2.getString("batch_payload_iterator_factory");
        this.A05 = string10 == null ? null : string10;
        this.A00 = string3;
        this.A06 = string9;
        String string11 = bundle2.getString("upload_extra_params_user_id");
        if (string11 == null) {
            this.A02 = null;
        } else {
            this.A02 = new C4068ClF(string11);
        }
    }

    public static void A00(BaseBundle baseBundle, C4045Cko c4045Cko) {
        baseBundle.putString("flexible_sampling_updater", c4045Cko.A09);
        baseBundle.putString("privacy_policy", c4045Cko.A08);
        baseBundle.putString("thread_handler_factory", c4045Cko.A0A);
        baseBundle.putString("upload_job_instrumentation", c4045Cko.A0B);
        baseBundle.putString("priority_dir", c4045Cko.A03.getAbsolutePath());
        baseBundle.putInt("network_priority", c4045Cko.A04.intValue());
        baseBundle.putString("marauder_tier", c4045Cko.A07);
        baseBundle.putInt("multi_batch_payload_size", c4045Cko.A01);
        baseBundle.putInt("non_sticky_handling", c4045Cko.A0D ? 1 : 0);
        baseBundle.putInt("use_fifo_uploads", c4045Cko.A0E ? 1 : 0);
        baseBundle.putString("batch_payload_iterator_factory", c4045Cko.A05);
        baseBundle.putString("acs_provider", c4045Cko.A00);
        baseBundle.putString("ffdb_provider", c4045Cko.A06);
    }

    public C4045Cko(C4061Cl4 c4061Cl4, File file, int i) {
        String name;
        Class<? extends InterfaceC4012Cjq> cls = c4061Cl4.A02;
        this.A00 = DefaultFalcoAcsProvider.class.getName();
        this.A0C = cls.getName();
        Class<? extends SamplingPolicyConfig> cls2 = c4061Cl4.A01;
        if (cls2 != null) {
            name = cls2.getName();
        } else {
            name = null;
        }
        this.A09 = name;
        this.A08 = null;
        this.A0A = DefaultHandlerThreadFactory.class.getName();
        this.A0B = null;
        this.A03 = file;
        this.A04 = c4061Cl4.A03;
        this.A07 = c4061Cl4.A04;
        this.A01 = i;
        this.A0D = false;
        this.A0E = false;
        this.A05 = null;
        Class<? extends InterfaceC4071ClJ> cls3 = c4061Cl4.A00;
        this.A06 = cls3 != null ? cls3.getName() : null;
        this.A02 = null;
    }
}
