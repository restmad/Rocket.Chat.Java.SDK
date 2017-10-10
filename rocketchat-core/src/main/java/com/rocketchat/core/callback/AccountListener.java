package com.rocketchat.core.callback;

import com.rocketchat.common.data.model.ErrorObject;
import com.rocketchat.common.listener.Listener;
import com.rocketchat.core.model.Permission;
import com.rocketchat.core.model.PublicSetting;
import java.util.List;

/**
 * Created by sachin on 26/7/17.
 */
public class AccountListener {
    public interface getPermissionsListener extends Listener {
        void onGetPermissions(List<Permission> permissions, ErrorObject error);
    }

    public interface getPublicSettingsListener extends Listener {
        void onGetPublicSettings(List<PublicSetting> settings, ErrorObject error);
    }
}
