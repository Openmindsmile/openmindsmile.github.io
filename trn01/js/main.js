// window.addEventListener('DOMcontentloaded', function) {
// document.querySelector('.header').style.display = 'none';
// })

$(function () {
    $('.main_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 900,
        vertical: true,
        dots: true,
    });

})