
<link rel="stylesheet" href="style/teststyle.css" type="text/css" media="screen">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>

<div class="example">
    <div class="menu">
        <span>
            <ul id="nav">
                <li><a href="#">Home</a></li>
                <li><a href="#">Tutorials</a>
                    <div class="subs">
                        <div>
                            <ul>
                                <li><h3>Submenu #1</h3>
                                    <ul>
                                        <li><a href="#">Link 1</a></li>
                                        <li><a href="#">Link 2</a></li>
                                        <li><a href="#">Link 3</a></li>
                                        <li><a href="#">Link 4</a></li>
                                        <li><a href="#">Link 5</a></li>
                                    </ul>
                                </li>
                                <li><h3>Submenu #2</h3>
                                    <ul>
                                        <li><a href="#">Link 6</a></li>
                                        <li><a href="#">Link 7</a></li>
                                        <li><a href="#">Link 8</a></li>
                                    </ul>
                                </li>
                                <li><h3>Submenu #3</h3>
                                    <ul>
                                        <li><a href="#">Link 9</a></li>
                                        <li><a href="#">Link 10</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li><a href="#">Resources</a>
                    <div class="subs">
                        <div class="wrp2">
                            <ul>
                                <li><h3>Submenu #4</h3>
                                    <ul>
                                        <li><a href="#">Link 1</a></li>
                                        <li><a href="#">Link 2</a></li>
                                        <li><a href="#">Link 3</a></li>
                                        <li><a href="#">Link 4</a></li>
                                        <li><a href="#">Link 5</a></li>
                                    </ul>
                                </li>
                                <li><h3>Submenu #5</h3>
                                    <ul>
                                        <li><a href="#">Link 6</a></li>
                                        <li><a href="#">Link 7</a></li>
                                        <li><a href="#">Link 8</a></li>
                                        <li><a href="#">Link 9</a></li>
                                        <li><a href="#">Link 10</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <p class="sep"></p>
                            <ul>
                                <li><h3>Submenu #6</h3>
                                    <ul>
                                        <li><a href="#">Link 11</a></li>
                                        <li><a href="#">Link 12</a></li>
                                        <li><a href="#">Link 13</a></li>
                                    </ul>
                                </li>
                                <li><h3>Submenu #7</h3>
                                    <ul>
                                        <li><a href="#">Link 14</a></li>
                                        <li><a href="#">Link 15</a></li>
                                        <li><a href="#">Link 16</a></li>

                                    </ul>
                                </li>
                                <li><h3>Submenu #8</h3>
                                    <ul>
                                        <li><a href="#">Link 17</a></li>
                                        <li><a href="#">Link 18</a></li>
                                        <li><a href="#">Link 19</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li><a href="http://www.script-tutorials.com/about/">About</a></li>
                <li><a href="http://www.script-tutorials.com/click-action-css3-dropdown-menu-with-jquery/">Go Back To The Tutorial</a></li>
            </ul>
        </span>
    </div>
</div>

<script type="text/javascript">
jQuery(window).load(function() {

    $("#nav > li > a").click(function () { // binding onclick
        if ($(this).parent().hasClass('selected')) {
            $("#nav .selected div div").slideUp(100); // hiding popups
            $("#nav .selected").removeClass("selected");
        } else {
            $("#nav .selected div div").slideUp(100); // hiding popups
            $("#nav .selected").removeClass("selected");

            if ($(this).next(".subs").length) {
                $(this).parent().addClass("selected"); // display popup
                $(this).next(".subs").children().slideDown(200);
            }
        }
    }); 

});
</script>