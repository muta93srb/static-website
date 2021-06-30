if(typeof Math.imul == "undefined" || (Math.imul(0xffffffff,5) == 0)) {
    Math.imul = function (a, b) {
        var ah  = (a >>> 16) & 0xffff;
        var al = a & 0xffff;
        var bh  = (b >>> 16) & 0xffff;
        var bl = b & 0xffff;
        // the shift by 0 fixes the sign on the high part
        // the final |0 converts the unsigned value into a signed value
        return ((al * bl) + (((ah * bl + al * bh) << 16) >>> 0)|0);
    }
}


/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
            ;function d(a){var b=a.length;if(0<b){for(var f=Array(b),c=0;c<b;c++)f[c]=a[c];return f}return[]};(class{constructor(a,b){this.g=b===e?a:""}}).prototype.toString=function(){return"SafeStyle{"+this.g+"}"};var e={};var g={},h={};if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof k)var k={};if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof l)var l=null;if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof m)var m=null;if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof n)var n=null;
var p="undefined"!==typeof Math&&"undefined"!==typeof Math.imul&&0!==Math.imul(4294967295,5)?function(a,b){return Math.imul(a,b)}:function(a,b){var f=a&65535,c=b&65535;return f*c+((a>>>16&65535)*c+f*(b>>>16&65535)<<16>>>0)|0};function q(a){a=p(a|0,-862048943);a=0^(p(a<<15|a>>>-15,461845907)|0);a=(p(a<<13|a>>>-13,5)+-430675100|0)^0;a=p(a^a>>>16,-2048144789);p(a^a>>>13,-1028477387)}q(1);q(0);if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof r)var r=null;
"undefined"!==typeof console&&(l=function(){return console.log.apply(console,d(arguments))},m=function(){return console.error.apply(console,d(arguments))});if("undefined"===typeof g||"undefined"===typeof h||"undefined"===typeof t)var t=function(){throw Error("cljs.core/*eval* not bound");};console.log("Hello, Github Pages!");