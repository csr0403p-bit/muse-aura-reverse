package X;

import com.facebook.logginginfra.falco.GetQPLConfigDirective;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;

/* loaded from: classes5.dex */
public interface DHQ {
    GetQPLConfigDirective getQPLConfigDirective(PrincipalSubject principalSubject);

    boolean handleConfig(SetQPLConfigDirective setQPLConfigDirective);
}
