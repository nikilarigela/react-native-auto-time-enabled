using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Auto.Time.Enabled.RNAutoTimeEnabled
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAutoTimeEnabledModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAutoTimeEnabledModule"/>.
        /// </summary>
        internal RNAutoTimeEnabledModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAutoTimeEnabled";
            }
        }
    }
}
